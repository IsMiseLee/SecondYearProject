
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
/*2.2*/import models.products.Product
/*3.2*/import models.products.Artist
/*4.2*/import models.users.Member

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Product],List[Artist],Long,String,Member,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(products: List[Product],artists: List[Artist], artId: Long, filter: String,member: Member,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.119*/("""


"""),_display_(/*8.2*/main("ListPRoducts",member)/*8.29*/ {_display_(Seq[Any](format.raw/*8.31*/("""
  """),format.raw/*9.3*/("""<h1>List of Albums</h1>
  <br>
  <div class="row">
    <div class="col-sm-2">
      <h4>Genres</h4>
      <div class="list-group">
        <a href=""""),_display_(/*15.19*/routes/*15.25*/.ProductCtrl.listProducts(0, filter)),format.raw/*15.61*/("""" class="list-group-item">All Genres</a>
        """),_display_(/*16.10*/for(a <- artists) yield /*16.27*/ {_display_(Seq[Any](format.raw/*16.29*/("""
          """),format.raw/*17.11*/("""<a href=""""),_display_(/*17.21*/routes/*17.27*/.ProductCtrl.listProducts(a.getId, filter)),format.raw/*17.69*/("""" class="list-group-item">"""),_display_(/*17.96*/a/*17.97*/.getGenre),format.raw/*17.106*/("""
            """),format.raw/*18.13*/("""<span class="badge">"""),_display_(/*18.34*/a/*18.35*/.getProducts.size()),format.raw/*18.54*/("""</span>
          </a>
        """)))}),format.raw/*20.10*/("""
      """),format.raw/*21.7*/("""</div>
    </div>
    <div class="col-sm-10">
        """),_display_(/*24.10*/if(flash.containsKey("success"))/*24.42*/ {_display_(Seq[Any](format.raw/*24.44*/("""
          """),format.raw/*25.11*/("""<div class="alert alert-success">
            """),_display_(/*26.14*/flash/*26.19*/.get("success")),format.raw/*26.34*/("""
          """),format.raw/*27.11*/("""</div>
        """)))}),format.raw/*28.10*/("""
  
        
        """),format.raw/*31.9*/("""<div id="actions">
          <form action=""""),_display_(/*32.26*/routes/*32.32*/.ProductCtrl.listProducts(artId)),format.raw/*32.64*/("""" method="GET">
           <input type="search" id="searchbox" name="filter" value=""""),_display_(/*33.70*/filter),format.raw/*33.76*/("""" placeholder="Filter by album name...">
           <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
          </form>
         </div>


  <table class="table">
      
      <thead>
      
   
      
      <tr>

     <th>Images</th>
      
      <th>ID</th>
      
      <th>Album Name</th>
      
      <th>Year</th>
      
      <th>Artist name</th>
      
      <th>Price</th>

      <th>Stock</th>

      <th colspan="2"></th> 
      </tr>
      
      </thead>
      
      <tbody>
    
      
      """),_display_(/*69.8*/for(p<-products) yield /*69.24*/{_display_(Seq[Any](format.raw/*69.25*/("""
        """),format.raw/*70.9*/("""<tr>


            """),_display_(/*73.14*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*73.101*/{_display_(Seq[Any](format.raw/*73.102*/("""
              """),format.raw/*74.15*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*74.70*/(p.getId + ".png ")),format.raw/*74.89*/(""""/></td>
            """)))}/*75.15*/else/*75.20*/{_display_(Seq[Any](format.raw/*75.21*/("""
              """),format.raw/*76.15*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
          """)))}),format.raw/*77.12*/("""   
          """),format.raw/*78.11*/("""<td>"""),_display_(/*78.16*/p/*78.17*/.getId),format.raw/*78.23*/("""</td>
          
          <td><a href=""""),_display_(/*80.25*/routes/*80.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*80.67*/("""">
              """),_display_(/*81.16*/p/*81.17*/.getAlbum_name),format.raw/*81.31*/("""</td>
           </a>    
          <td>"""),_display_(/*83.16*/p/*83.17*/.getYear),format.raw/*83.25*/("""</td>
          <td>"""),_display_(/*84.16*/p/*84.17*/.getArt_name),format.raw/*84.29*/("""</td>
          <td>"""),_display_(/*85.16*/p/*85.17*/.getPrice),format.raw/*85.26*/("""</td>
          <td>"""),_display_(/*86.16*/p/*86.17*/.getStock),format.raw/*86.26*/("""</td>
          <td><a href=""""),_display_(/*87.25*/routes/*87.31*/.ShopCartCtrl.addToBasket(p.getId)),format.raw/*87.65*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
      """)))}),format.raw/*88.8*/("""
      
      """),format.raw/*90.7*/("""</tbody>
      
      </table>
      
      <p>
        <a href=""""),_display_(/*95.19*/routes/*95.25*/.AdminProductCtrl.addProduct()),format.raw/*95.55*/(""""> 
          <button class="btn btn-primary">Add a project</button>
        </a>
      </p>
    
""")))}),format.raw/*100.2*/("""
"""))
      }
    }
  }

  def render(products:List[Product],artists:List[Artist],artId:Long,filter:String,member:Member,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,artists,artId,filter,member,env)

  def f:((List[Product],List[Artist],Long,String,Member,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,artists,artId,filter,member,env) => apply(products,artists,artId,filter,member,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 05 20:45:24 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/listProducts.scala.html
                  HASH: 31b33f2d2b607533e69c53b73081596c23f98a06
                  MATRIX: 651->2|689->34|726->65|1124->93|1337->210|1366->214|1401->241|1440->243|1469->246|1645->395|1660->401|1717->437|1794->487|1827->504|1867->506|1906->517|1943->527|1958->533|2021->575|2075->602|2085->603|2116->612|2157->625|2205->646|2215->647|2255->666|2318->698|2352->705|2434->760|2475->792|2515->794|2554->805|2628->852|2642->857|2678->872|2717->883|2764->899|2812->920|2883->964|2898->970|2951->1002|3063->1087|3090->1093|3663->1640|3695->1656|3734->1657|3770->1666|3817->1686|3914->1773|3954->1774|3997->1789|4079->1844|4119->1863|4160->1886|4173->1891|4212->1892|4255->1907|4371->1992|4413->2006|4445->2011|4455->2012|4482->2018|4550->2059|4565->2065|4622->2101|4667->2119|4677->2120|4712->2134|4780->2175|4790->2176|4819->2184|4867->2205|4877->2206|4910->2218|4958->2239|4968->2240|4998->2249|5046->2270|5056->2271|5086->2280|5143->2310|5158->2316|5213->2350|5349->2456|5390->2470|5483->2536|5498->2542|5549->2572|5679->2671
                  LINES: 24->2|25->3|26->4|31->5|36->5|39->8|39->8|39->8|40->9|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|62->31|63->32|63->32|63->32|64->33|64->33|100->69|100->69|100->69|101->70|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|108->77|109->78|109->78|109->78|109->78|111->80|111->80|111->80|112->81|112->81|112->81|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|121->90|126->95|126->95|126->95|131->100
                  -- GENERATED --
              */
          