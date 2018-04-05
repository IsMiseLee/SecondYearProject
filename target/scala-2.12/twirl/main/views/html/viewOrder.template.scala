
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
/*1.2*/import models.users.Member

object viewOrder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.shopping.OrderItem],Member,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(orderItem: List[models.shopping.OrderItem],member: Member,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.87*/(""")


"""),_display_(/*5.2*/main("",member)/*5.17*/ {_display_(Seq[Any](format.raw/*5.19*/("""
    """),format.raw/*6.5*/("""<table class="table">   
        <thead>
          <tr>
            <th>ID</th>
            <th>Album name</th>         
            <th>Artist name</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Total</th>   
          </tr>
        </thead>
  
        <tbody>
          """),_display_(/*19.12*/for(o<-orderItem) yield /*19.29*/ {_display_(Seq[Any](format.raw/*19.31*/("""
              """),format.raw/*20.15*/("""<td class="numeric">"""),_display_(/*20.36*/o/*20.37*/.getId),format.raw/*20.43*/("""</td>
              <td>"""),_display_(/*21.20*/o/*21.21*/.getProduct.getAlbum_name),format.raw/*21.46*/("""</td>
              <td>"""),_display_(/*22.20*/o/*22.21*/.getProduct.getArt_name),format.raw/*22.44*/("""</td>     
              <td>"""),_display_(/*23.20*/o/*23.21*/.getQuantity),format.raw/*23.33*/("""</td>

              <td  class="numeric">"""),_display_(/*25.37*/("%.2f".format(o.getPrice))),format.raw/*25.64*/("""</td>
              <td>&euro; """),_display_(/*26.27*/("%.2f".format(o.getItemTotal))),format.raw/*26.58*/("""</td>
              
              <br>
            </tr>
            
          """)))}),format.raw/*31.12*/("""
        """),format.raw/*32.9*/("""</tbody>   
""")))}))
      }
    }
  }

  def render(orderItem:List[models.shopping.OrderItem],member:Member,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(orderItem,member,env)

  def f:((List[models.shopping.OrderItem],Member,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (orderItem,member,env) => apply(orderItem,member,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 05 20:45:24 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/viewOrder.scala.html
                  HASH: 8b638a657225fa32797df93997bd64fdc514d844
                  MATRIX: 651->1|1039->29|1219->114|1249->119|1272->134|1311->136|1342->141|1673->445|1706->462|1746->464|1789->479|1837->500|1847->501|1874->507|1926->532|1936->533|1982->558|2034->583|2044->584|2088->607|2145->637|2155->638|2188->650|2258->693|2306->720|2365->752|2417->783|2530->865|2566->874
                  LINES: 24->1|29->2|34->2|37->5|37->5|37->5|38->6|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|57->25|57->25|58->26|58->26|63->31|64->32
                  -- GENERATED --
              */
          