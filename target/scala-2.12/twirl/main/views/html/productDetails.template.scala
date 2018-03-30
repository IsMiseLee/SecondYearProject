
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
          <th>Test</th> 
        </tr>
      </thead>

      <tbody>

          <tr>
              """),_display_(/*27.16*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*27.103*/{_display_(Seq[Any](format.raw/*27.104*/("""
                """),format.raw/*28.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*28.72*/(p.getId + ".png ")),format.raw/*28.91*/(""""/></td>
              """)))}/*29.17*/else/*29.22*/{_display_(Seq[Any](format.raw/*29.23*/("""
                """),format.raw/*30.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
            """)))}),format.raw/*31.14*/("""  
            """),format.raw/*32.13*/("""<td class="numeric">"""),_display_(/*32.34*/p/*32.35*/.getId),format.raw/*32.41*/("""</td>

            """),_display_(/*34.14*/if(env.resource("public/audio/"+ p.getId + ".mp3").isDefined)/*34.75*/{_display_(Seq[Any](format.raw/*34.76*/("""
              """),format.raw/*35.15*/("""<td> <audio controls src="/assets/audio/"""),_display_(/*35.56*/(p.getId + ".mp3 ")),format.raw/*35.75*/("""" type="audio/mpeg"></audio></td>
            """)))}/*36.15*/else/*36.20*/{_display_(Seq[Any](format.raw/*36.21*/("""
              """),format.raw/*37.15*/("""<td><h2>Not avalibale</h2></td>
          """)))}),format.raw/*38.12*/("""   
            
            
             
            
          """),format.raw/*43.11*/("""</tr>
        
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
                  DATE: Fri Mar 30 20:58:38 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/productDetails.scala.html
                  HASH: fa70c70d7e0d2e696833814bbd20205272679e4b
                  MATRIX: 651->1|689->33|1058->61|1206->114|1235->118|1269->144|1308->146|1339->151|1465->251|1506->283|1546->285|1582->294|1654->339|1668->344|1704->359|1740->368|1784->382|1818->389|2014->558|2111->645|2151->646|2196->663|2278->718|2318->737|2361->762|2374->767|2413->768|2458->785|2576->872|2619->887|2667->908|2677->909|2704->915|2751->935|2821->996|2860->997|2903->1012|2971->1053|3011->1072|3077->1120|3090->1125|3129->1126|3172->1141|3246->1184|3341->1251
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|64->32|64->32|64->32|64->32|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|70->38|75->43
                  -- GENERATED --
              */
          