
package views.html.adminProduct

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.Member,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String,member: models.users.Member)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.60*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        """),format.raw/*23.32*/("""

         """),format.raw/*25.10*/("""<nav class="navbar navbar-default">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href=""""),_display_(/*34.27*/routes/*34.33*/.ProductCtrl.index()),format.raw/*34.53*/("""" class="navbar-brand">Aural Soul</a>
            </div>
            <!-- Collection of nav links and other content for toggling -->
            <div id="navbarCollapse" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href=""""),_display_(/*40.35*/routes/*40.41*/.ProductCtrl.aboutUs()),format.raw/*40.63*/("""">About us</a></li>
                    <li><a href=""""),_display_(/*41.35*/routes/*41.41*/.ProductCtrl.viewAlbums()),format.raw/*41.66*/("""">Artists</a></li>
                    <li><a href=""""),_display_(/*42.35*/routes/*42.41*/.AdminProductCtrl.listProduct()),format.raw/*42.72*/("""">Products</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li """),_display_(/*45.26*/if(title=="Login")/*45.44*/{_display_(Seq[Any](format.raw/*45.45*/("""class="active"""")))}),format.raw/*45.60*/(""">
                    """),_display_(/*46.22*/if(member != null)/*46.40*/ {_display_(Seq[Any](format.raw/*46.42*/("""
                        """),format.raw/*47.25*/("""<a href=""""),_display_(/*47.35*/controllers/*47.46*/.security.routes.LoginCtrl.logout()),format.raw/*47.81*/("""">Logout """),_display_(/*47.91*/member/*47.97*/.getName()),format.raw/*47.107*/("""</a>
                    """)))}/*48.23*/else/*48.28*/{_display_(Seq[Any](format.raw/*48.29*/("""
                        """),format.raw/*49.25*/("""<a href=""""),_display_(/*49.35*/controllers/*49.46*/.security.routes.LoginCtrl.login()),format.raw/*49.80*/(""""><span class="glyphicon glyphicon-log-in" id="logIcon"> Login</a>
                    """)))}),format.raw/*50.22*/("""

                """),format.raw/*52.17*/("""</li>

      
                    
                </ul>
            </div>
        </nav>
        """),_display_(/*59.10*/content),format.raw/*59.17*/("""

        """),format.raw/*61.9*/("""<script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.versioned("javascripts/main.js")),format.raw/*61.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,member:models.users.Member,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,member)(content)

  def f:((String,models.users.Member) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,member) => (content) => apply(title,member)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 28 17:17:23 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/main.scala.html
                  HASH: cfc4daf43d43d321c542c4cb41162cfde270811b
                  MATRIX: 1239->260|1392->318|1420->320|1500->425|1536->434|1571->442|1597->447|1686->509|1701->515|1764->556|1852->617|1867->623|1928->662|2305->1101|2344->1112|2909->1650|2924->1656|2965->1676|3339->2023|3354->2029|3397->2051|3478->2105|3493->2111|3539->2136|3619->2189|3634->2195|3686->2226|3837->2350|3864->2368|3903->2369|3949->2384|3999->2407|4026->2425|4066->2427|4119->2452|4156->2462|4176->2473|4232->2508|4269->2518|4284->2524|4316->2534|4361->2561|4374->2566|4413->2567|4466->2592|4503->2602|4523->2613|4578->2647|4697->2735|4743->2753|4870->2853|4898->2860|4935->2870|4976->2884|4991->2890|5052->2930
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|53->23|55->25|64->34|64->34|64->34|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|75->45|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|80->50|82->52|89->59|89->59|91->61|91->61|91->61|91->61
                  -- GENERATED --
              */
          