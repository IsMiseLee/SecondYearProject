
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

"""),_display_(/*5.2*/main("Album ",member)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
 
  """),format.raw/*7.3*/("""<body>
          <div class="jumbotron">
              <div class="container text-center">
                <h1>Albums Avaliabe</h1>      
              </div>
            </div>
            
            <div class="container">
              
                """),_display_(/*16.18*/for(p<-products) yield /*16.34*/{_display_(Seq[Any](format.raw/*16.35*/("""
            """),format.raw/*17.13*/("""<div class="container-fluid bg-3 text-center">    
              <div class="row">
                <div class="col-sm-3">
                    """),_display_(/*20.22*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*20.109*/{_display_(Seq[Any](format.raw/*20.110*/("""
                      """),format.raw/*21.23*/("""<img src="public/images/productImages/thumbnails/" + id + ".png" class="img-responsive" style="width:100%" alt="Image">
                    """)))}/*22.23*/else/*22.28*/{_display_(Seq[Any](format.raw/*22.29*/("""
                     """),format.raw/*23.22*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                  """)))}),format.raw/*24.20*/("""   
             
                """),format.raw/*26.17*/("""<a href=""""),_display_(/*26.27*/routes/*26.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*26.69*/("""">
                      """),_display_(/*27.24*/p/*27.25*/.getAlbum_name),format.raw/*27.39*/("""</a>
              </div>
              <td>"""),_display_(/*29.20*/p/*29.21*/.topSeller),format.raw/*29.31*/("""</td>
      
            </div> 
          </div>
            </div><br><br>
            
          """)))}),format.raw/*35.12*/("""
  
""")))}),format.raw/*37.2*/("""
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
                  DATE: Sun Apr 22 18:34:41 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/viewAlbums.scala.html
                  HASH: 744be7e77cd54da6b56f46a7afca3f67667112df
                  MATRIX: 651->1|689->33|1073->61|1248->141|1276->144|1305->165|1344->167|1375->172|1661->431|1693->447|1732->448|1773->461|1943->604|2040->691|2080->692|2131->715|2291->857|2304->862|2343->863|2393->885|2508->969|2570->1003|2607->1013|2622->1019|2679->1055|2732->1081|2742->1082|2777->1096|2849->1141|2859->1142|2890->1152|3022->1253|3057->1258
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|39->7|48->16|48->16|48->16|49->17|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|58->26|58->26|58->26|58->26|59->27|59->27|59->27|61->29|61->29|61->29|67->35|69->37
                  -- GENERATED --
              */
          