
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
/*1.2*/import models.products.Product
/*2.2*/import models.users.Member

object viewAlbums extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Product],models.users.Member,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(products: List[Product], member: models.users.Member,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.82*/("""

"""),_display_(/*5.2*/main("Welcome to Play",member)/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""
  """),format.raw/*6.3*/("""<!DOCTYPE html>
  <html lang="en">
  <head>
    <title>Main Page</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  <body>
          <div class="jumbotron">
              <div class="container text-center">
                <h1>Albums Avaliabe</h1>      
              </div>
            </div>
            
            <div class="container">
              
                """),_display_(/*26.18*/for(p<-products) yield /*26.34*/{_display_(Seq[Any](format.raw/*26.35*/("""
            """),format.raw/*27.13*/("""<div class="container-fluid bg-3 text-center">    
              <div class="row">
                <div class="col-sm-3">
                    """),_display_(/*30.22*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*30.109*/{_display_(Seq[Any](format.raw/*30.110*/("""
                      """),format.raw/*31.23*/("""<img src="public/images/productImages/thumbnails/" + id + ".png" class="img-responsive" style="width:100%" alt="Image">
                    """)))}/*32.23*/else/*32.28*/{_display_(Seq[Any](format.raw/*32.29*/("""
                     """),format.raw/*33.22*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                  """)))}),format.raw/*34.20*/("""   
             
                """),format.raw/*36.17*/("""<a href=""""),_display_(/*36.27*/routes/*36.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*36.69*/("""">
                      """),_display_(/*37.24*/p/*37.25*/.getAlbum_name),format.raw/*37.39*/("""</a>
              </div>
               
      
            </div> 
          </div>
            </div><br><br>
            
          """)))}),format.raw/*45.12*/("""
  
""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(products:List[Product],member:models.users.Member,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,member,env)

  def f:((List[Product],models.users.Member,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,member,env) => apply(products,member,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 28 17:33:11 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/viewAlbums.scala.html
                  HASH: 5c7fe8dac49a95ac9e4367a64c3f11d11bd973f3
                  MATRIX: 651->1|689->33|1073->61|1248->141|1276->144|1314->174|1353->176|1382->179|2208->978|2240->994|2279->995|2320->1008|2490->1151|2587->1238|2627->1239|2678->1262|2838->1404|2851->1409|2890->1410|2940->1432|3055->1516|3117->1550|3154->1560|3169->1566|3226->1602|3279->1628|3289->1629|3324->1643|3492->1780|3527->1785
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|38->6|58->26|58->26|58->26|59->27|62->30|62->30|62->30|63->31|64->32|64->32|64->32|65->33|66->34|68->36|68->36|68->36|68->36|69->37|69->37|69->37|77->45|79->47
                  -- GENERATED --
              */
          