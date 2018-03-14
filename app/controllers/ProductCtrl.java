package controllers;

import play.mvc.*;
import views.html.*;
import play.api.Environment;
import play.data.*;


import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

// import models.*;
// import models.users.*;
// import views.html.*;


public class ProductCtrl extends Controller {

    public Result listProduct() {
        return ok(views.html.listProduct.render());
    }

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result aboutUs() {
        return ok(views.html.aboutUs.render());
    }

}