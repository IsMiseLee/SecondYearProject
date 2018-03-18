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
import views.html.*;


public class ArtistCtrl extends Controller {

    public Result listArtist() {
        return ok(views.html.listArtist.render(Member.getLoggedIn(session().get("email"))));
    }

}