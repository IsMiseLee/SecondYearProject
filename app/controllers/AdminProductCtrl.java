package controllers;

import controllers.security.*;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.users.*;
import models.products.*;
import views.html.*;
import views.html.adminProduct.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

@Security.Authenticated(Secured.class)
@With(IfAdmin.class)
public class AdminProductCtrl extends Controller {

    private FormFactory formFactory;
    private Environment e;
    
    @Inject
    public AdminProductCtrl(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
    }

    @Transactional
    public Result listProduct(Long art) {
        List<Artist> artists = Artist.findAll();		
        List<Product> products = new ArrayList<Product>();
    
        if (art == 0) {
            products = Product.findAll();
        }else {
            products = Artist.find.ref(art).getProducts();
        }
        return ok(listProduct.render(products, artists, Member.getLoggedIn(session().get("email")),e));
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addProduct() {
        Form<Product> addProductForm = formFactory.form(Product.class);
        return ok(addProduct.render(addProductForm,Member.getLoggedIn(session().get("email"))));
    }
    
    @Transactional
    public Result addProductSubmit(){ 
        String saveImageMsg;
        Product newProduct;
        Form<Product> newProductForm =formFactory.form(Product.class).bindFromRequest();
        if(newProductForm.hasErrors()){ 
    
            return badRequest(addProduct.render(newProductForm,Member.getLoggedIn(session().get("email"))));
        }else { 
         newProduct =newProductForm.get();

             newProduct.save();
          
           for (Long art : newProduct.getArtSelect()) {
        newProduct.artists.add(Artist.find.byId(art));
        }
           newProduct.update();
}
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        saveImageMsg = saveFile(newProduct.getId(), image);

        flash("success", "Prodcut " + newProduct.getAlbum_name() + " has been created/updated " + saveImageMsg);
        saveImageMsg = saveFile(newProduct.getId(), image);

        return ok(views.html.index.render(Member.getLoggedIn(session().get("email"))));
    }


    @Transactional
    public Result deleteProduct(Long id){ 
        Product.find.ref(id).delete();
        flash("success");

        return redirect(controllers.routes.AdminProductCtrl.listProduct(0));
    }
    @Transactional
    public Result updateProduct(Long id){ 
        
        Product p;
         Form<Product> productForm;
        
        try { 
            p=Product.find.byId(id);
        
            productForm = formFactory.form(Product.class).fill(p);
        
            }catch (Exception ex){ 
                        return badRequest("error");
            }
             return ok(updateProduct.render(id, productForm,Member.getMemberById(session().get("email"))));
            }
        

    public Result updateProductSubmit(Long id) {
        String saveImageMsg;           
                            
         Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();
                    
                           
        if (updateProductForm.hasErrors()) {
                               
            return badRequest(updateProduct.render(id,updateProductForm, Member.getMemberById(session().get("email"))));
            } else {
                              
           Product p = updateProductForm.get();
           p.setId(id);

           List<Artist> newArts = new ArrayList<Artist>();
           for (Long art : p.getArtSelect()) {
            newArts.add(Artist.find.byId(art));
           }
           p.artists = newArts;
           p.update();
              
           MultipartFormData data = request().body().asMultipartFormData();
           FilePart image = data.getFile("upload");
   
           saveImageMsg = saveFile(p.getId(), image);
   
           flash("success", "Prodcut " + p.getAlbum_name() + " has been created/updated " + saveImageMsg);
           saveImageMsg = saveFile(p.getId(), image);
                              
            return redirect(controllers.routes.AdminProductCtrl.listProduct(0));
             }
        
       } 

       public String saveFile(Long id, FilePart<File> uploaded) {
       
        if (uploaded != null) {
          
            String mimeType = uploaded.getContentType(); 
            if (mimeType.startsWith("image/")) {
                String fileName = uploaded.getFilename();                
                File file = uploaded.getFile();
                IMOperation op = new IMOperation();
               
                op.addImage(file.getAbsolutePath());
               
                op.resize(300, 200);
                op.addImage("public/images/productImages/" + id + ".png");
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(20);
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".png");
              
                File dir = new File("public/images/productImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
           
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";
            }
        }
        return "/ no file";
    }
        
}