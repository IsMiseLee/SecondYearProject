
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
                        <th>Artist Name</th>
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
                                <td>"""),_display_(/*38.38*/i/*38.39*/.getProduct.getArt_name),format.raw/*38.62*/("""</td>
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
                  DATE: Fri Mar 30 20:58:38 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/basket.scala.html
                  HASH: 0947e23469a0fbe4db0c623bf7721c2ad7ede9b9
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1192->34|1221->119|1249->122|1290->155|1329->157|1361->162|1468->242|1509->274|1549->276|1600->299|1688->360|1702->365|1738->380|1789->403|1844->427|1899->454|2485->1013|2526->1045|2566->1047|2623->1076|2741->1167|2804->1214|2844->1216|2901->1245|2970->1287|2980->1288|3026->1313|3096->1356|3106->1357|3150->1380|3227->1430|3275->1457|3352->1507|3404->1538|3474->1581|3484->1582|3519->1596|3598->1648|3613->1654|3666->1686|3803->1796|3818->1802|3890->1852|4047->1978|4126->2026|4175->2047|4552->2397|4567->2403|4615->2430|4985->2773|5000->2779|5047->2805
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|41->9|41->9|41->9|42->10|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|51->19|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|77->45|78->46|79->47|89->57|89->57|89->57|95->63|95->63|95->63
                  -- GENERATED --
              */
          