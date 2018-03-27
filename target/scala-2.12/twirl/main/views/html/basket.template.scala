
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*7.1*/("""

"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
    """),format.raw/*10.5*/("""<div class="row">
        
            <div class="col-md-12">
                """),_display_(/*13.18*/if(flash.containsKey("success"))/*13.50*/ {_display_(Seq[Any](format.raw/*13.52*/("""
                      """),format.raw/*14.23*/("""<div class="alert alert-success">
                          """),_display_(/*15.28*/flash/*15.33*/.get("success")),format.raw/*15.48*/("""
                      """),format.raw/*16.23*/("""</div>
                """)))}),format.raw/*17.18*/(""" 
        
                """),format.raw/*19.17*/("""<table class="table table-bordered table-hover table-condensed">
                    <thead>
                    <!-- The header row-->
                    <tr>
                        <th>Album Name</th>
                        <th>Type</th>
                        <th>Item Price</th>
                        <th>Total</th>
                        <th>Quantity</th>
                        <th>dec.</th>
                        <th>inc.</th>
                    </tr>
                    </thead>
                    <tbody>
                        """),_display_(/*33.26*/if(customer.getBasket() != null)/*33.58*/ {_display_(Seq[Any](format.raw/*33.60*/("""
                            """),format.raw/*34.29*/("""<!-- Start of For loop - For each p in products add a row -->
                            """),_display_(/*35.30*/for(i <- customer.getBasket().getBasketItems()) yield /*35.77*/ {_display_(Seq[Any](format.raw/*35.79*/("""
                            """),format.raw/*36.29*/("""<tr>
                                <td>"""),_display_(/*37.38*/i/*37.39*/.getProduct.getAlbum_name),format.raw/*37.64*/("""</td>
                                <td>"""),_display_(/*38.38*/i/*38.39*/.getProduct.getType),format.raw/*38.58*/("""</td>
                                <td>&euro; """),_display_(/*39.45*/("%.2f".format(i.getPrice))),format.raw/*39.72*/("""</td>
                                <td>&euro; """),_display_(/*40.45*/("%.2f".format(i.getItemTotal))),format.raw/*40.76*/("""</td>
                                <td>"""),_display_(/*41.38*/i/*41.39*/.getQuantity()),format.raw/*41.53*/("""</td>
                                <td><a href=""""),_display_(/*42.47*/routes/*42.53*/.ShopCartCtrl.removeOne(i.getId)),format.raw/*42.85*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                                <td><a href=""""),_display_(/*43.47*/routes/*43.53*/.ShopCartCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*43.103*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                            </tr>
                            """)))}),format.raw/*45.30*/("""<!-- End of For loop -->
                      """)))}),format.raw/*46.24*/("""
                    """),format.raw/*47.21*/("""</tbody>
                </table>
                <div class="row">
                    <div class="col-md-12">
                       
                    </div>  
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*57.39*/routes/*57.45*/.ShopCartCtrl.emptyBasket()),format.raw/*57.72*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                        </p>
                    </div>  
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*63.39*/routes/*63.45*/.ShopCartCtrl.placeOrder()),format.raw/*63.71*/("""" class="btn btn-success btn-sm">
                            <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                        </p>
                    </div>  
                </div>
            </div>
        </div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 15:57:11 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/basket.scala.html
                  HASH: 5135f28d7bb598bf72011cf526ebd1ee739e6aa2
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1192->34|1221->119|1249->122|1290->155|1329->157|1361->162|1468->242|1509->274|1549->276|1600->299|1688->360|1702->365|1738->380|1789->403|1844->427|1899->454|2478->1006|2519->1038|2559->1040|2616->1069|2734->1160|2797->1207|2837->1209|2894->1238|2963->1280|2973->1281|3019->1306|3089->1349|3099->1350|3139->1369|3216->1419|3264->1446|3341->1496|3393->1527|3463->1570|3473->1571|3508->1585|3587->1637|3602->1643|3655->1675|3792->1785|3807->1791|3879->1841|4036->1967|4115->2015|4164->2036|4541->2386|4556->2392|4604->2419|4974->2762|4989->2768|5036->2794
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|41->9|41->9|41->9|42->10|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|51->19|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|77->45|78->46|79->47|89->57|89->57|89->57|95->63|95->63|95->63
                  -- GENERATED --
              */
          