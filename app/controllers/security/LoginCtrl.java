package controllers.security;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.users.*;

public class LoginCtrl extends Controller {
    private FormFactory formFactory;
    private Environment env;

    @Inject
    public LoginCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm,Member.getMemberById(session().get("email"))));
    }

    public Result loginSubmit() {
        
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        
        if (loginForm.hasErrors()) {
          
            return badRequest(login.render(loginForm, Member.getLoggedIn(session().get("email"))));
        } 
        else {
           
            session().clear();
            
            session("email", loginForm.get().getEmail());
            
           
            Member m = Member.getLoggedIn(loginForm.get().getEmail());
           
            if (m != null && "admin".equals(m.getRole())) {
                return redirect(controllers.routes.AdminProductCtrl.listProduct(0));
            }
            
           
            return redirect(controllers.routes.ProductCtrl.index());
        }
    }

    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(controllers.security.routes.LoginCtrl.login());
    }

        
    
}
