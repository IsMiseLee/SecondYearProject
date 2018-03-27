package controllers.security;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

public class IfCustomer extends Action.Simple {

    public CompletionStage<Result> call(Http.Context ctx) {

        String id = ctx.session().get("email");
        if (id != null) {
            Member m = Member.getLoggedIn(id);
            if ("customer".equals(m.getRole())) {
                return delegate.call(ctx);
            }
        }
     
        ctx.flash().put("error", "Login Required.");
        return CompletableFuture.completedFuture(redirect(routes.LoginCtrl.login()));
    }
}