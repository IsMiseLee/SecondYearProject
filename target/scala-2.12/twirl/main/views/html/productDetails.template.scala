
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
    <table class="table">
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
                  DATE: Thu Apr 05 20:45:24 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/productDetails.scala.html
                  HASH: a93566643b6cc58ca99dd2823bacd1192055bba4
                  MATRIX: 651->1|689->33|1058->61|1206->114|1235->118|1269->144|1308->146|1339->151|1422->208|1463->240|1503->242|1539->251|1611->296|1625->301|1661->316|1697->325|1741->339|1775->346|1971->515|2068->602|2108->603|2153->620|2235->675|2275->694|2318->719|2331->724|2370->725|2415->742|2533->829|2576->844|2624->865|2634->866|2661->872|2708->892|2778->953|2817->954|2860->969|2928->1010|2968->1029|3034->1077|3047->1082|3086->1083|3129->1098|3203->1141|3298->1208
                  LINES: 24->1|25->2|30->3|35->3|38->6|38->6|38->6|41->9|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|64->32|64->32|64->32|64->32|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|70->38|75->43
                  -- GENERATED --
              */
          