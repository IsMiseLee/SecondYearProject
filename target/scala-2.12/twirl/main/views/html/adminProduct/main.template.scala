
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/style.css")),format.raw/*14.102*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        """),format.raw/*23.32*/("""

         """),format.raw/*25.10*/("""<nav class="navbar navbar-inverse">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="" class="navbar-brand">Aural Soul</a>
            </div>
            <!-- Collection of nav links and other content for toggling -->
            <div id="navbarCollapse" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                  
                    <li><a href=""""),_display_(/*41.35*/routes/*41.41*/.AdminProductCtrl.listProduct(0)),format.raw/*41.73*/("""">Products</a></li>
                  
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
        """),format.raw/*60.9*/("""<body background="/assets/images/background.jpg">
        <script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.versioned("javascripts/main.js")),format.raw/*61.69*/("""" type="text/javascript"></script>
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
                  DATE: Sun Apr 22 18:34:41 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/main.scala.html
                  HASH: 002d0dc51191d7457bca29ccd6ac601129fceb29
                  MATRIX: 1239->260|1392->318|1420->320|1500->425|1536->434|1571->442|1597->447|1686->509|1701->515|1765->557|1853->618|1868->624|1929->663|2306->1102|2345->1113|3275->2016|3290->2022|3343->2054|3513->2197|3540->2215|3579->2216|3625->2231|3675->2254|3702->2272|3742->2274|3795->2299|3832->2309|3852->2320|3908->2355|3945->2365|3960->2371|3992->2381|4037->2408|4050->2413|4089->2414|4142->2439|4179->2449|4199->2460|4254->2494|4373->2582|4419->2600|4546->2700|4574->2707|4610->2716|4709->2788|4724->2794|4785->2834
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|53->23|55->25|71->41|71->41|71->41|75->45|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|80->50|82->52|89->59|89->59|90->60|91->61|91->61|91->61
                  -- GENERATED --
              */
          