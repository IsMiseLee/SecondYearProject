
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

object listProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.products.Product],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.products.Product],member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""

"""),_display_(/*3.2*/main("ListPRoducts",member)/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Aural Soul</h1>

  <table class="table table-bordered table-hover table-condensed">
      
      <thead>
      
      <!-- The header row-->
      
      <tr>
      
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
    
      
      """),_display_(/*34.8*/for(p<-products) yield /*34.24*/{_display_(Seq[Any](format.raw/*34.25*/("""
        """),format.raw/*35.9*/("""<tr>
          <td>"""),_display_(/*36.16*/p/*36.17*/.getId),format.raw/*36.23*/("""</td>
          <td>"""),_display_(/*37.16*/p/*37.17*/.getAlbum_name),format.raw/*37.31*/("""</td>
          <td>"""),_display_(/*38.16*/p/*38.17*/.getYear),format.raw/*38.25*/("""</td>
          <td>"""),_display_(/*39.16*/p/*39.17*/.getType),format.raw/*39.25*/("""</td>
          <td>"""),_display_(/*40.16*/p/*40.17*/.getPrice),format.raw/*40.26*/("""</td>
          <td>"""),_display_(/*41.16*/p/*41.17*/.getStock),format.raw/*41.26*/("""/td>
         <td>
        
      """)))}),format.raw/*44.8*/("""
      
      """),format.raw/*46.7*/("""</tbody>
      
      </table>
      <p>
        <a href=""""),_display_(/*50.19*/routes/*50.25*/.AdminProductCtrl.addProduct()),format.raw/*50.55*/(""""> 
          <button class="btn btn-primary">Add a project</button>
        </a>
      </p>
    
""")))}),format.raw/*55.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.products.Product],member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(products,member)

  def f:((List[models.products.Product],models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (products,member) => apply(products,member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 18 16:03:11 GMT 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/listProduct.scala.html
                  HASH: 7ed2d62f07fe78024c554972102ac710b5e64782
                  MATRIX: 997->1|1161->70|1189->73|1224->100|1263->102|1292->105|1758->545|1790->561|1829->562|1865->571|1912->591|1922->592|1949->598|1997->619|2007->620|2042->634|2090->655|2100->656|2129->664|2177->685|2187->686|2216->694|2264->715|2274->716|2304->725|2352->746|2362->747|2392->756|2457->791|2498->805|2584->864|2599->870|2650->900|2779->999
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|76->44|78->46|82->50|82->50|82->50|87->55
                  -- GENERATED --
              */
          