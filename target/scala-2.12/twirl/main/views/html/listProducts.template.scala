
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
/*2.2*/import models.products.Product
/*3.2*/import models.users.Member

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[Product],Long,String,Member,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product], catId: Long, filter: String,member: Member,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.97*/("""


"""),_display_(/*7.2*/main("ListPRoducts",member)/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""
  """),format.raw/*8.3*/("""<h1>List of Products</h1>

  <table class="table table-bordered table-hover table-condensed">
      
      <thead>
      
      <!-- The header row-->
      
      <tr>

     <th>Images</th>
      
      <th>ID</th>
      
      <th>Album Name</th>
      
      <th>Year</th>
      
      <th>Type</th>
      
      <th>Price</th>

      <th>Stock</th>

      <th colspan="2"></th> 
      </tr>
      
      </thead>
      
      <tbody>
    
      
      """),_display_(/*40.8*/for(p<-products) yield /*40.24*/{_display_(Seq[Any](format.raw/*40.25*/("""
        """),format.raw/*41.9*/("""<tr>


            """),_display_(/*44.14*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*44.101*/{_display_(Seq[Any](format.raw/*44.102*/("""
              """),format.raw/*45.15*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*45.70*/(p.getId + ".png ")),format.raw/*45.89*/(""""/></td>
            """)))}/*46.15*/else/*46.20*/{_display_(Seq[Any](format.raw/*46.21*/("""
              """),format.raw/*47.15*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
          """)))}),format.raw/*48.12*/("""   
          """),format.raw/*49.11*/("""<td>"""),_display_(/*49.16*/p/*49.17*/.getId),format.raw/*49.23*/("""</td>
          
          <td><a href=""""),_display_(/*51.25*/routes/*51.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*51.67*/("""">
            """),_display_(/*52.14*/p/*52.15*/.getAlbum_name),format.raw/*52.29*/("""</td>
           </a>    
          <td>"""),_display_(/*54.16*/p/*54.17*/.getYear),format.raw/*54.25*/("""</td>
          <td>"""),_display_(/*55.16*/p/*55.17*/.getType),format.raw/*55.25*/("""</td>
          <td>"""),_display_(/*56.16*/p/*56.17*/.getPrice),format.raw/*56.26*/("""</td>
          <td>"""),_display_(/*57.16*/p/*57.17*/.getStock),format.raw/*57.26*/("""</td>
          <td><a href=""""),_display_(/*58.25*/routes/*58.31*/.ShopCartCtrl.addToBasket(p.getId)),format.raw/*58.65*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
      """)))}),format.raw/*59.8*/("""
      
      """),format.raw/*61.7*/("""</tbody>
      
      </table>
      
      <p>
        <a href=""""),_display_(/*66.19*/routes/*66.25*/.AdminProductCtrl.addProduct()),format.raw/*66.55*/(""""> 
          <button class="btn btn-primary">Add a project</button>
        </a>
      </p>
    
""")))}),format.raw/*71.2*/("""
"""))
      }
    }
  }

  def render(products:List[Product],catId:Long,filter:String,member:Member,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,catId,filter,member,env)

  def f:((List[Product],Long,String,Member,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,catId,filter,member,env) => apply(products,catId,filter,member,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 19:21:04 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/listProducts.scala.html
                  HASH: 47cf9807dca3416067676c15cbf373a98e4f5196
                  MATRIX: 651->2|689->34|1074->62|1264->157|1293->161|1328->188|1367->190|1396->193|1879->650|1911->666|1950->667|1986->676|2033->696|2130->783|2170->784|2213->799|2295->854|2335->873|2376->896|2389->901|2428->902|2471->917|2587->1002|2629->1016|2661->1021|2671->1022|2698->1028|2766->1069|2781->1075|2838->1111|2881->1127|2891->1128|2926->1142|2994->1183|3004->1184|3033->1192|3081->1213|3091->1214|3120->1222|3168->1243|3178->1244|3208->1253|3256->1274|3266->1275|3296->1284|3353->1314|3368->1320|3423->1354|3559->1460|3600->1474|3693->1540|3708->1546|3759->1576|3888->1675
                  LINES: 24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|71->40|71->40|71->40|72->41|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|79->48|80->49|80->49|80->49|80->49|82->51|82->51|82->51|83->52|83->52|83->52|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|92->61|97->66|97->66|97->66|102->71
                  -- GENERATED --
              */
          