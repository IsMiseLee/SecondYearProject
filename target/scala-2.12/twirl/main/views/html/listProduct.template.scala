
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

object listProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.products.Product],models.users.Member,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.products.Product],member: models.users.Member,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.97*/("""

"""),_display_(/*3.2*/main("ListPRoducts",member)/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
  """),format.raw/*4.3*/("""<h1>List of Products</h1>

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
    
      
      """),_display_(/*36.8*/for(p<-products) yield /*36.24*/{_display_(Seq[Any](format.raw/*36.25*/("""
        """),format.raw/*37.9*/("""<tr>


            """),_display_(/*40.14*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*40.101*/{_display_(Seq[Any](format.raw/*40.102*/("""
              """),format.raw/*41.15*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*41.70*/(p.getId + ".png ")),format.raw/*41.89*/(""""/></td>
            """)))}/*42.15*/else/*42.20*/{_display_(Seq[Any](format.raw/*42.21*/("""
              """),format.raw/*43.15*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
          """)))}),format.raw/*44.12*/("""   
          """),format.raw/*45.11*/("""<td>"""),_display_(/*45.16*/p/*45.17*/.getId),format.raw/*45.23*/("""</td>
          <td>"""),_display_(/*46.16*/p/*46.17*/.getAlbum_name),format.raw/*46.31*/("""</td>
          <td>"""),_display_(/*47.16*/p/*47.17*/.getYear),format.raw/*47.25*/("""</td>
          <td>"""),_display_(/*48.16*/p/*48.17*/.getType),format.raw/*48.25*/("""</td>
          <td>"""),_display_(/*49.16*/p/*49.17*/.getPrice),format.raw/*49.26*/("""</td>
          <td>"""),_display_(/*50.16*/p/*50.17*/.getStock),format.raw/*50.26*/("""</td>

          <td><a href=""""),_display_(/*52.25*/routes/*52.31*/.ShopCartCtrl.addToBasket(p.getId)),format.raw/*52.65*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>

          <td>
                <a href=""""),_display_(/*55.27*/routes/*55.33*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*55.73*/("""" class="button-xs btn-danger" onclick="">
                  <span class="glyphicon glyphicon-pencil"></span>
                 </a>
              <td>    
                  <a href=""""),_display_(/*59.29*/routes/*59.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*59.75*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                      <span class="glyphicon glyphicon-trash"></span>
                    </a>
                  </td>
        
      """)))}),format.raw/*64.8*/("""
      
      """),format.raw/*66.7*/("""</tbody>
      
      </table>
      
      <p>
        <a href=""""),_display_(/*71.19*/routes/*71.25*/.AdminProductCtrl.addProduct()),format.raw/*71.55*/(""""> 
          <button class="btn btn-primary">Add a project</button>
        </a>
      </p>
    
""")))}),format.raw/*76.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.products.Product],member:models.users.Member,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,member,env)

  def f:((List[models.products.Product],models.users.Member,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,member,env) => apply(products,member,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 15:57:11 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/listProduct.scala.html
                  HASH: b49364e0dc3adf7aea4affc4421cdc48bbb91946
                  MATRIX: 1018->1|1208->96|1236->99|1271->126|1310->128|1339->131|1822->588|1854->604|1893->605|1929->614|1976->634|2073->721|2113->722|2156->737|2238->792|2278->811|2319->834|2332->839|2371->840|2414->855|2530->940|2572->954|2604->959|2614->960|2641->966|2689->987|2699->988|2734->1002|2782->1023|2792->1024|2821->1032|2869->1053|2879->1054|2908->1062|2956->1083|2966->1084|2996->1093|3044->1114|3054->1115|3084->1124|3142->1155|3157->1161|3212->1195|3380->1336|3395->1342|3456->1382|3666->1565|3681->1571|3742->1611|3970->1809|4011->1823|4104->1889|4119->1895|4170->1925|4299->2024
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|68->36|68->36|68->36|69->37|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|76->44|77->45|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|84->52|84->52|84->52|87->55|87->55|87->55|91->59|91->59|91->59|96->64|98->66|103->71|103->71|103->71|108->76
                  -- GENERATED --
              */
          