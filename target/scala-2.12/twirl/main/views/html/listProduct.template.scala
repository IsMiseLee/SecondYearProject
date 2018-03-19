
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
  """),format.raw/*4.3*/("""<h1>List of Products</h1>

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
          <td>"""),_display_(/*41.16*/p/*41.17*/.getStock),format.raw/*41.26*/("""</td>
              

          <td>
                <a href=""""),_display_(/*45.27*/routes/*45.33*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*45.73*/("""" class="button-xs btn-danger" onclick="">
                  <span class="glyphicon glyphicon-pencil"></span>
                 </a>
              <td>    
                  <a href=""""),_display_(/*49.29*/routes/*49.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*49.75*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                      <span class="glyphicon glyphicon-trash"></span>
                    </a>
                  </td>
        
      """)))}),format.raw/*54.8*/("""
      
      """),format.raw/*56.7*/("""</tbody>
      
      </table>
      
      <p>
        <a href=""""),_display_(/*61.19*/routes/*61.25*/.AdminProductCtrl.addProduct()),format.raw/*61.55*/(""""> 
          <button class="btn btn-primary">Add a project</button>
        </a>
      </p>
    
""")))}),format.raw/*66.2*/("""
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
                  DATE: Mon Mar 19 17:23:25 GMT 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/listProduct.scala.html
                  HASH: d5364fe533b7aa73fde8c7fe01a0a33363bcd767
                  MATRIX: 997->1|1161->70|1189->73|1224->100|1263->102|1292->105|1753->540|1785->556|1824->557|1860->566|1907->586|1917->587|1944->593|1992->614|2002->615|2037->629|2085->650|2095->651|2124->659|2172->680|2182->681|2211->689|2259->710|2269->711|2299->720|2347->741|2357->742|2387->751|2477->814|2492->820|2553->860|2763->1043|2778->1049|2839->1089|3067->1287|3108->1301|3201->1367|3216->1373|3267->1403|3396->1502
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|77->45|77->45|77->45|81->49|81->49|81->49|86->54|88->56|93->61|93->61|93->61|98->66
                  -- GENERATED --
              */
          