
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
/*3.2*/import play.api.Play.current
/*4.2*/import models.shopping._
/*5.2*/import models.products._


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/main("Shopping Basket", customer)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
    """),format.raw/*9.5*/("""<div class="row">
        
    <div class="col-md-12">
        """),_display_(/*12.10*/if(flash.containsKey("success"))/*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
        """),format.raw/*13.9*/("""<div class="alert alert-success">
         """),_display_(/*14.11*/flash/*14.16*/.get("success")),format.raw/*14.31*/("""
       """),format.raw/*15.8*/("""</div>
                """)))}),format.raw/*16.18*/(""" 
        
"""),format.raw/*18.1*/("""<table class="table ">
<thead>
                   
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
        """),_display_(/*32.10*/if(customer.getBasket() != null)/*32.42*/ {_display_(Seq[Any](format.raw/*32.44*/("""
                          
        """),_display_(/*34.10*/for(i <- customer.getBasket().getBasketItems()) yield /*34.57*/ {_display_(Seq[Any](format.raw/*34.59*/("""
        """),format.raw/*35.9*/("""<tr>
            <td>"""),_display_(/*36.18*/i/*36.19*/.getProduct.getAlbum_name),format.raw/*36.44*/("""</td>
            <td>"""),_display_(/*37.18*/i/*37.19*/.getProduct.getArt_name),format.raw/*37.42*/("""</td>
            <td>&euro; """),_display_(/*38.25*/("%.2f".format(i.getPrice))),format.raw/*38.52*/("""</td>
            <td>&euro; """),_display_(/*39.25*/("%.2f".format(i.getItemTotal))),format.raw/*39.56*/("""</td>
            <td>"""),_display_(/*40.18*/i/*40.19*/.getQuantity()),format.raw/*40.33*/("""</td>
            <td><a href=""""),_display_(/*41.27*/routes/*41.33*/.ShopCartCtrl.removeOne(i.getId)),format.raw/*41.65*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
            <td><a href=""""),_display_(/*42.27*/routes/*42.33*/.ShopCartCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*42.83*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                            </tr>
                            """)))}),format.raw/*44.30*/("""
                      """)))}),format.raw/*45.24*/("""
                    """),format.raw/*46.21*/("""</tbody>
                </table>
                <div class="row">
                    <div class="col-md-12">
                       
                    </div>  
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*56.39*/routes/*56.45*/.ShopCartCtrl.emptyBasket()),format.raw/*56.72*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                        </p>
                    </div>  
                    <div class="col-md-6">
                        <p class="text-right">
                            <a href=""""),_display_(/*62.39*/routes/*62.45*/.ShopCartCtrl.placeOrder()),format.raw/*62.71*/("""" class="btn btn-success btn-sm">
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
                  DATE: Sun Apr 22 18:34:41 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/basket.scala.html
                  HASH: 2a3d14d40f79b74c04618744474d25033ed2b82e
                  MATRIX: 964->1|1070->37|1106->67|1138->93|1192->34|1220->118|1248->121|1289->154|1328->156|1359->161|1450->225|1491->257|1531->259|1567->268|1638->312|1652->317|1688->332|1723->340|1778->364|1816->375|2057->589|2098->621|2138->623|2202->660|2265->707|2305->709|2341->718|2390->740|2400->741|2446->766|2496->789|2506->790|2550->813|2607->843|2655->870|2712->900|2764->931|2814->954|2824->955|2859->969|2918->1001|2933->1007|2986->1039|3103->1129|3118->1135|3189->1185|3346->1311|3401->1335|3450->1356|3827->1706|3842->1712|3890->1739|4260->2082|4275->2088|4322->2114
                  LINES: 28->1|31->3|32->4|33->5|36->1|38->6|40->8|40->8|40->8|41->9|44->12|44->12|44->12|45->13|46->14|46->14|46->14|47->15|48->16|50->18|64->32|64->32|64->32|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|76->44|77->45|78->46|88->56|88->56|88->56|94->62|94->62|94->62
                  -- GENERATED --
              */
          