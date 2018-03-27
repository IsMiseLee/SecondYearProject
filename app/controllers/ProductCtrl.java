package controllers;

import play.mvc.*;
import views.html.*;
import play.api.Environment;
import play.data.*;


import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;
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

    public Result listProduct() {
        List<Product> products = Product.findAll();
        return ok(views.html.listProduct.render(products,Member.getLoggedIn(session().get("email")),e));
    }

    public Result index() {
        return ok(views.html.index.render(Member.getLoggedIn(session().get("email"))));
    }


    public Result aboutUs() {
        return ok(views.html.aboutUs.render(Member.getLoggedIn(session().get("email"))));
    }

}