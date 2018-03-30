package controllers;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.users.*;
import models.shopping.*;
import models.products.*;
import views.html.*;



public class ProductCtrl extends Controller {
    private FormFactory formFactory;
    private Environment e;
    
    @Inject
    public ProductCtrl(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
    }

    @Transactional
	public Member getCurrentUser() {
		Member m = Member.getLoggedIn(session().get("email"));
		return m;
	}

    public Result index() {
        return ok(views.html.index.render(Member.getLoggedIn(session().get("email"))));
    }

    public Result viewOrder() {
      
        return redirect(routes.ProductCtrl.viewOrder());
    }

    public Result aboutUs() {
        return ok(views.html.aboutUs.render(Member.getLoggedIn(session().get("email"))));
    }

    public Result productDetails(Long id) {
        Product p;

        p = Product.find.byId(id);

        return ok(productDetails.render(p,Member.getLoggedIn(session().get("email")),e));
    }
    
    @Transactional
    public Result listProducts(Long art, String filter) {		
        List<Product> products = new ArrayList<Product>();
        List<Artist> categories = Artist.findAll();
        if (art == 0) {
            products = Product.findAll(filter);
        }
        else {
            products = Product.findFilter(art, filter);
        }
        return ok(listProducts.render(products,categories, art, filter, getCurrentUser(),e));
    }

    public Result viewAlbums() {
        List<Product> products = new ArrayList<Product>();
        return ok(views.html.viewAlbums.render(products,Member.getLoggedIn(session().get("email")),e));
    }

    public Result register() {
        Form<Member> registerForm = formFactory.form(Member.class);
        return ok(register.render(registerForm,Member.getLoggedIn(session().get("email"))));
    }
    
    public Result registerSubmit(){ 
       
        Member newMember;
        Form<Member> registerForm =formFactory.form(Member.class).bindFromRequest();
        if(registerForm.hasErrors()){ 
    
            return badRequest(register.render(registerForm,Member.getLoggedIn(session().get("email"))));
        }else { 
            newMember =registerForm.get();

            newMember.save();

        }
       

        return ok(views.html.index.render(Member.getLoggedIn(session().get("email"))));
    }
  


}