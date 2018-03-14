package controllers;

import play.mvc.*;
import views.html.*;
import play.api.Environment;
import play.data.*;


import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;




public class ArtistCtrl extends Controller {

    public Result listArtist() {
        return ok(views.html.listArtist.render());
    }

}