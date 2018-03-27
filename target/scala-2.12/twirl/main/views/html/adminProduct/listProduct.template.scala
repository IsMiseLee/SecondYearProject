
package views.html.adminProduct

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
/*2.2*/import models.products.Product
/*3.2*/import models.users.Member

object listProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.products.Product],models.users.Member,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[models.products.Product],member: models.users.Member,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.97*/("""

"""),_display_(/*6.2*/main("ListPRoducts",member)/*6.29*/ {_display_(Seq[Any](format.raw/*6.31*/("""
  """),format.raw/*7.3*/("""<h1>List of Products</h1>

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
    
      
      """),_display_(/*39.8*/for(p<-products) yield /*39.24*/{_display_(Seq[Any](format.raw/*39.25*/("""
        """),format.raw/*40.9*/("""<tr>


            """),_display_(/*43.14*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*43.101*/{_display_(Seq[Any](format.raw/*43.102*/("""
              """),format.raw/*44.15*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*44.70*/(p.getId + ".png ")),format.raw/*44.89*/(""""/></td>
            """)))}/*45.15*/else/*45.20*/{_display_(Seq[Any](format.raw/*45.21*/("""
              """),format.raw/*46.15*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
          """)))}),format.raw/*47.12*/("""   
          """),format.raw/*48.11*/("""<td>"""),_display_(/*48.16*/p/*48.17*/.getId),format.raw/*48.23*/("""</td>
          <td>"""),_display_(/*49.16*/p/*49.17*/.getAlbum_name),format.raw/*49.31*/("""</td>
          <td>"""),_display_(/*50.16*/p/*50.17*/.getYear),format.raw/*50.25*/("""</td>
          <td>"""),_display_(/*51.16*/p/*51.17*/.getType),format.raw/*51.25*/("""</td>
          <td>"""),_display_(/*52.16*/p/*52.17*/.getPrice),format.raw/*52.26*/("""</td>
          <td>"""),_display_(/*53.16*/p/*53.17*/.getStock),format.raw/*53.26*/("""</td>

          <td>
                <a href=""""),_display_(/*56.27*/routes/*56.33*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*56.73*/("""" class="button-xs btn-danger" onclick="">
                  <span class="glyphicon glyphicon-pencil"></span>
                 </a>
                </td>
              <td>    
                  <a href=""""),_display_(/*61.29*/routes/*61.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*61.75*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                      <span class="glyphicon glyphicon-trash"></span>
                    </a>
                  </td>
        
      """)))}),format.raw/*66.8*/("""
      
      """),format.raw/*68.7*/("""</tbody>
      
      </table>
      
      <p>
        <a href=""""),_display_(/*73.19*/routes/*73.25*/.AdminProductCtrl.addProduct()),format.raw/*73.55*/(""""> 
          <button class="btn btn-primary">Add a project</button>
        </a>
      </p>
    
""")))}),format.raw/*78.2*/("""
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
                  DATE: Tue Mar 27 18:53:30 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/listProduct.scala.html
                  HASH: ca32aeb7930f2d7e653081a4e3557a594f8cd392
                  MATRIX: 664->2|702->34|1103->62|1293->157|1321->160|1356->187|1395->189|1424->192|1907->649|1939->665|1978->666|2014->675|2061->695|2158->782|2198->783|2241->798|2323->853|2363->872|2404->895|2417->900|2456->901|2499->916|2615->1001|2657->1015|2689->1020|2699->1021|2726->1027|2774->1048|2784->1049|2819->1063|2867->1084|2877->1085|2906->1093|2954->1114|2964->1115|2993->1123|3041->1144|3051->1145|3081->1154|3129->1175|3139->1176|3169->1185|3244->1233|3259->1239|3320->1279|3552->1484|3567->1490|3628->1530|3856->1728|3897->1742|3990->1808|4005->1814|4056->1844|4185->1943
                  LINES: 24->2|25->3|30->4|35->4|37->6|37->6|37->6|38->7|70->39|70->39|70->39|71->40|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|78->47|79->48|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|87->56|87->56|87->56|92->61|92->61|92->61|97->66|99->68|104->73|104->73|104->73|109->78
                  -- GENERATED --
              */
          