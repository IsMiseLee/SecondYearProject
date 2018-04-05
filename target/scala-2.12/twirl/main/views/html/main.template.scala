
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
          
                    
               
        """),format.raw/*26.32*/("""

         """),format.raw/*28.10*/("""<nav class="navbar navbar-inverse">
           
            <div class="navbar-header">
                <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href=""""),_display_(/*37.27*/routes/*37.33*/.ProductCtrl.index()),format.raw/*37.53*/("""" class="navbar-brand">Aural Soul</a>
            </div>
           
            <div id="navbarCollapse" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href=""""),_display_(/*42.50*/routes/*42.56*/.ProductCtrl.index()),format.raw/*42.76*/("""">Home</a></li>
                    <li><a href=""""),_display_(/*43.35*/routes/*43.41*/.ProductCtrl.aboutUs()),format.raw/*43.63*/("""">About us</a></li>
                    <li><a href=""""),_display_(/*44.35*/routes/*44.41*/.ProductCtrl.viewAlbums()),format.raw/*44.66*/("""">viewAlbums</a></li>
                    <li><a href=""""),_display_(/*45.35*/routes/*45.41*/.ProductCtrl.listProducts(0,"")),format.raw/*45.72*/("""">Products</a></li>
                    <li><a href=""""),_display_(/*46.35*/routes/*46.41*/.ShopCartCtrl.viewOrder()),format.raw/*46.66*/("""">view Orders</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                      
                    <li><a href=""""),_display_(/*50.35*/routes/*50.41*/.ProductCtrl.register()),format.raw/*50.64*/("""">Register</a></li>
                    <li """),_display_(/*51.26*/if(title=="Login")/*51.44*/{_display_(Seq[Any](format.raw/*51.45*/("""class="active"""")))}),format.raw/*51.60*/("""> 
                    """),_display_(/*52.22*/if(member != null)/*52.40*/ {_display_(Seq[Any](format.raw/*52.42*/("""
                        """),format.raw/*53.25*/("""<a href=""""),_display_(/*53.35*/controllers/*53.46*/.security.routes.LoginCtrl.logout()),format.raw/*53.81*/("""">Logout """),_display_(/*53.91*/member/*53.97*/.getName()),format.raw/*53.107*/("""</a>
                    """)))}/*54.23*/else/*54.28*/{_display_(Seq[Any](format.raw/*54.29*/("""
                        """),format.raw/*55.25*/("""<a href=""""),_display_(/*55.35*/controllers/*55.46*/.security.routes.LoginCtrl.login()),format.raw/*55.80*/(""""><span class="glyphicon glyphicon-log-in" id="logIcon"></span> Login</a>
                    """)))}),format.raw/*56.22*/("""

                """),format.raw/*58.17*/("""</li>
 
                </ul>
            </div>
        </nav>
        """),_display_(/*63.10*/content),format.raw/*63.17*/("""
        """),format.raw/*64.9*/("""<body background="/assets/images/background.jpg">
         
        <script src=""""),_display_(/*66.23*/routes/*66.29*/.Assets.versioned("javascripts/main.js")),format.raw/*66.69*/("""" type="text/javascript"></script>
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
                  DATE: Thu Apr 05 20:45:24 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/main.scala.html
                  HASH: f87b1bb748b0de909c54e59ec20359761d0c4945
                  MATRIX: 1226->260|1379->318|1407->320|1487->425|1523->434|1558->442|1584->447|1673->509|1688->515|1752->557|1840->618|1855->624|1916->663|2341->1150|2380->1161|2881->1635|2896->1641|2937->1661|3197->1894|3212->1900|3253->1920|3330->1970|3345->1976|3388->1998|3469->2052|3484->2058|3530->2083|3613->2139|3628->2145|3680->2176|3761->2230|3776->2236|3822->2261|4008->2420|4023->2426|4067->2449|4139->2494|4166->2512|4205->2513|4251->2528|4302->2552|4329->2570|4369->2572|4422->2597|4459->2607|4479->2618|4535->2653|4572->2663|4587->2669|4619->2679|4664->2706|4677->2711|4716->2712|4769->2737|4806->2747|4826->2758|4881->2792|5007->2887|5053->2905|5153->2978|5181->2985|5217->2994|5326->3076|5341->3082|5402->3122
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|56->26|58->28|67->37|67->37|67->37|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|80->50|80->50|80->50|81->51|81->51|81->51|81->51|82->52|82->52|82->52|83->53|83->53|83->53|83->53|83->53|83->53|83->53|84->54|84->54|84->54|85->55|85->55|85->55|85->55|86->56|88->58|93->63|93->63|94->64|96->66|96->66|96->66
                  -- GENERATED --
              */
          