
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("Home Page",member)/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

        """),format.raw/*5.9*/("""<h1>Welcome to Aural Soul</h1>
                
             <hr class="featurette-divider">
                
        <div class="row featurette">
             <div class="col-md-7">
             
              <p class="lead">Click here to log in to the site </p>
              <a href=""""),_display_(/*13.25*/controllers/*13.36*/.security.routes.LoginCtrl.login()),format.raw/*13.70*/(""""> 
                <button class="btn btn-primary">Log in </button>
              </a>
              </div>
              
              <div class="col-md-5">
               <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="500x500" style="width: 500px; height: 500px;" src="/assets/images/musicImages/music1.png" data-holder-rendered="true">
               </div>
              </div>
                
              <hr class="featurette-divider">
                
          <div class="row featurette">
          <div class="col-md-7 order-md-2">
           
            <p class="lead">Press here to learn more about us </p>
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.ProductCtrl.aboutUs()),format.raw/*29.51*/(""""> 
                <button class="btn btn-primary">About us</button>
              </a>
            </div>
          
           <div class="col-md-5 order-md-1">
           <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="500x500" style="width: 500px; height: 500px;" src="/assets/images/musicImages/music2.jpg" data-holder-rendered="true">
            </div>
            </div>
                
            <hr class="featurette-divider">
                
                
                    
        </main>
 
""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(member)

  def f:((models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (member) => apply(member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 18:34:41 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/index.scala.html
                  HASH: 36a595c5dddbee1165377f4b1fb4682013db076b
                  MATRIX: 961->1|1086->31|1114->34|1146->58|1185->60|1221->70|1537->359|1557->370|1612->404|2328->1093|2343->1099|2386->1121|2970->1675
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|45->13|45->13|45->13|61->29|61->29|61->29|77->45
                  -- GENERATED --
              */
          