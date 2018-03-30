
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
    """),format.raw/*6.5*/("""<table class="table table-bordered table-hover table-condensed">   
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>         
            <th>Quantity</th>
            <th>Price</th>
            <th>Total</th>   
          </tr>
        </thead>
  
        <tbody>
          """),_display_(/*18.12*/for(o<-orderItem) yield /*18.29*/ {_display_(Seq[Any](format.raw/*18.31*/("""
              """),format.raw/*19.15*/("""<td class="numeric">"""),_display_(/*19.36*/o/*19.37*/.getId),format.raw/*19.43*/("""</td>
             
                   
              <td>"""),_display_(/*22.20*/o/*22.21*/.getQuantity),format.raw/*22.33*/("""</td>
              <td  class="numeric">"""),_display_(/*23.37*/o/*23.38*/.getPrice),format.raw/*23.47*/("""</td>
         
              
  
            </tr>
          """)))}),format.raw/*28.12*/("""
        """),format.raw/*29.9*/("""</tbody>   
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
                  DATE: Fri Mar 30 20:58:38 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/viewOrder.scala.html
                  HASH: 66577831db837bab92834eea84a644f76d8cd000
                  MATRIX: 651->1|1039->29|1219->114|1249->119|1272->134|1311->136|1342->141|1677->449|1710->466|1750->468|1793->483|1841->504|1851->505|1878->511|1964->570|1974->571|2007->583|2076->625|2086->626|2116->635|2210->698|2246->707
                  LINES: 24->1|29->2|34->2|37->5|37->5|37->5|38->6|50->18|50->18|50->18|51->19|51->19|51->19|51->19|54->22|54->22|54->22|55->23|55->23|55->23|60->28|61->29
                  -- GENERATED --
              */
          