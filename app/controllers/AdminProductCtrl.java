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

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;


public class AdminProductCtrl extends Controller {

    private FormFactory formFactory;
    private Environment e;
    
    @Inject
    public AdminProductCtrl(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
    }

    @Transactional
    public Result addProduct() {
        Form<Product> addProductForm = formFactory.form(Product.class);
        return ok(addProduct.render(addProductForm,Member.getLoggedIn(session().get("email"))));
    }
    @Transactional
    public Result addProductSubmit(){ 
        
        Form<Product> newProductForm =formFactory.form(Product.class).bindFromRequest();
        if(newProductForm.hasErrors()){ 
    
            return badRequest(addProduct.render(newProductForm,Member.getLoggedIn(session().get("email"))));
        }else { 
            Product newProduct =newProductForm.get();
    
         
            newProduct.save();
            
    
            return ok(views.html.index.render(Member.getLoggedIn(session().get("email"))));
        }

    }
}