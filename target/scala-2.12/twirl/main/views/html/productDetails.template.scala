
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

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Product,Member,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(p: Product,member: Member,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.55*/("""


"""),_display_(/*6.2*/main("Full Image", member)/*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""


  """),format.raw/*9.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*11.8*/if(flash.containsKey("success"))/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
          """),_display_(/*13.12*/flash/*13.17*/.get("success")),format.raw/*13.32*/("""
        """),format.raw/*14.9*/("""</div>
      """)))}),format.raw/*15.8*/("""
      """),format.raw/*16.7*/("""<thead>
        <tr>
          <th>Image</th> 
          <th>ID</th> 
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*26.16*/if(env.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*26.93*/ {_display_(Seq[Any](format.raw/*26.95*/("""
                """),format.raw/*27.17*/("""<td><img src="/assets/images/productImages/"""),_display_(/*27.61*/(p.getId + ".jpg")),format.raw/*27.79*/(""""/></td>
            """)))}/*28.15*/else/*28.20*/{_display_(Seq[Any](format.raw/*28.21*/("""
                """),format.raw/*29.17*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
            """)))}),format.raw/*30.14*/("""
            """),format.raw/*31.13*/("""<td class="numeric">"""),_display_(/*31.34*/p/*31.35*/.getId),format.raw/*31.41*/("""</td>
            
          </tr>
        
      </tbody>

    </table>

    
  </div>
</div>
""")))}))
      }
    }
  }

  def render(p:Product,member:Member,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,member,env)

  def f:((Product,Member,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,member,env) => apply(p,member,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 18:43:32 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/productDetails.scala.html
                  HASH: c653e0be47037d7bf836eca06076534600774516
                  MATRIX: 651->1|689->33|1058->61|1206->114|1235->118|1269->144|1308->146|1339->151|1465->251|1506->283|1546->285|1582->294|1654->339|1668->344|1704->359|1740->368|1784->382|1818->389|1990->534|2076->611|2116->613|2161->630|2232->674|2271->692|2312->715|2325->720|2364->721|2409->738|2516->814|2557->827|2605->848|2615->849|2642->855
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|63->31|63->31|63->31|63->31
                  -- GENERATED --
              */
          