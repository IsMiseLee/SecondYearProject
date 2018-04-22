
package views.html.Register

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

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
          
                    
               
        """),format.raw/*26.32*/("""

         """),format.raw/*28.10*/("""<nav class="navbar navbar-inverse">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href=""""),_display_(/*37.27*/routes/*37.33*/.ProductCtrl.index()),format.raw/*37.53*/("""" class="navbar-brand">Aural Soul</a>
            </div>
            <!-- Collection of nav links and other content for toggling -->
            <div id="navbarCollapse" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href=""""),_display_(/*42.50*/routes/*42.56*/.ProductCtrl.index()),format.raw/*42.76*/("""">Home</a></li>
                    <li><a href=""""),_display_(/*43.35*/routes/*43.41*/.ProductCtrl.aboutUs()),format.raw/*43.63*/("""">About us</a></li>
                    
                    <li><a href=""""),_display_(/*45.35*/routes/*45.41*/.ProductCtrl.listProducts(0,"")),format.raw/*45.72*/("""">Products</a></li>
                    <li><a href=""""),_display_(/*46.35*/routes/*46.41*/.ShopCartCtrl.viewOrder()),format.raw/*46.66*/("""">view Orders</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                      
                    <li><a href=""""),_display_(/*50.35*/routes/*50.41*/.ProductCtrl.register()),format.raw/*50.64*/("""">Register</a></li>
                    <li """),_display_(/*51.26*/if(title=="Login")/*51.44*/{_display_(Seq[Any](format.raw/*51.45*/("""class="active"""")))}),format.raw/*51.60*/("""> 
                

                </li>

      
                    
                </ul>
            </div>
        </nav>
        """),_display_(/*61.10*/content),format.raw/*61.17*/("""
        """),format.raw/*62.9*/("""<body background="/assets/images/background.jpg">
         
        <script src=""""),_display_(/*64.23*/routes/*64.29*/.Assets.versioned("javascripts/main.js")),format.raw/*64.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 18:34:41 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/Register/main.scala.html
                  HASH: 623ee82b1d3f0e5e9f02aca9aae9c1b15a66bb86
                  MATRIX: 1215->260|1340->290|1368->292|1448->397|1484->406|1519->414|1545->419|1634->481|1649->487|1713->529|1801->590|1816->596|1877->635|2302->1122|2341->1133|2906->1671|2921->1677|2962->1697|3286->1994|3301->2000|3342->2020|3419->2070|3434->2076|3477->2098|3579->2173|3594->2179|3646->2210|3727->2264|3742->2270|3788->2295|3974->2454|3989->2460|4033->2483|4105->2528|4132->2546|4171->2547|4217->2562|4381->2699|4409->2706|4445->2715|4554->2797|4569->2803|4630->2843
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|56->26|58->28|67->37|67->37|67->37|72->42|72->42|72->42|73->43|73->43|73->43|75->45|75->45|75->45|76->46|76->46|76->46|80->50|80->50|80->50|81->51|81->51|81->51|81->51|91->61|91->61|92->62|94->64|94->64|94->64
                  -- GENERATED --
              */
          