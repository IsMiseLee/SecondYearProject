
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
                    <li><a href=""""),_display_(/*42.35*/routes/*42.41*/.AdminProductCtrl.listProduct(0)),format.raw/*42.73*/("""">Products</a></li>
                    <li><a href=""""),_display_(/*43.35*/routes/*43.41*/.ShopCartCtrl.viewOrder()),format.raw/*43.66*/("""">view Orders</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li """),_display_(/*46.26*/if(title=="Login")/*46.44*/{_display_(Seq[Any](format.raw/*46.45*/("""class="active"""")))}),format.raw/*46.60*/(""">
                    """),_display_(/*47.22*/if(member != null)/*47.40*/ {_display_(Seq[Any](format.raw/*47.42*/("""
                        """),format.raw/*48.25*/("""<a href=""""),_display_(/*48.35*/controllers/*48.46*/.security.routes.LoginCtrl.logout()),format.raw/*48.81*/("""">Logout """),_display_(/*48.91*/member/*48.97*/.getName()),format.raw/*48.107*/("""</a>
                    """)))}/*49.23*/else/*49.28*/{_display_(Seq[Any](format.raw/*49.29*/("""
                        """),format.raw/*50.25*/("""<a href=""""),_display_(/*50.35*/controllers/*50.46*/.security.routes.LoginCtrl.login()),format.raw/*50.80*/(""""><span class="glyphicon glyphicon-log-in" id="logIcon"> Login</a>
                    """)))}),format.raw/*51.22*/("""

                """),format.raw/*53.17*/("""</li>

      
                    
                </ul>
            </div>
        </nav>
        """),_display_(/*60.10*/content),format.raw/*60.17*/("""

        """),format.raw/*62.9*/("""<script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.versioned("javascripts/main.js")),format.raw/*62.69*/("""" type="text/javascript"></script>
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
                  DATE: Mon Apr 02 16:24:59 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/main.scala.html
                  HASH: 3fc8b57781a27130843f27d8b1808717a9693c24
                  MATRIX: 1239->260|1392->318|1420->320|1500->425|1536->434|1571->442|1597->447|1686->509|1701->515|1764->556|1852->617|1867->623|1928->662|2305->1101|2344->1112|2909->1650|2924->1656|2965->1676|3339->2023|3354->2029|3397->2051|3478->2105|3493->2111|3539->2136|3619->2189|3634->2195|3687->2227|3768->2281|3783->2287|3829->2312|3983->2439|4010->2457|4049->2458|4095->2473|4145->2496|4172->2514|4212->2516|4265->2541|4302->2551|4322->2562|4378->2597|4415->2607|4430->2613|4462->2623|4507->2650|4520->2655|4559->2656|4612->2681|4649->2691|4669->2702|4724->2736|4843->2824|4889->2842|5016->2942|5044->2949|5081->2959|5122->2973|5137->2979|5198->3019
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|53->23|55->25|64->34|64->34|64->34|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43|73->43|73->43|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|78->48|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50|80->50|80->50|81->51|83->53|90->60|90->60|92->62|92->62|92->62|92->62
                  -- GENERATED --
              */
          