
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
  """),format.raw/*9.3*/("""<div class="jumbotron">
    <div class="container text-center">
      <h1>List of Albums</h1>      
    </div>
  </div>

  <br>
  <div class="row">
    <div class="col-sm-2">
      <h4>Genres</h4>
      <div class="list-group">
        <a href=""""),_display_(/*20.19*/routes/*20.25*/.ProductCtrl.listProducts(0, filter)),format.raw/*20.61*/("""" class="list-group-item">All Genres</a>
        """),_display_(/*21.10*/for(a <- artists) yield /*21.27*/ {_display_(Seq[Any](format.raw/*21.29*/("""
          """),format.raw/*22.11*/("""<a href=""""),_display_(/*22.21*/routes/*22.27*/.ProductCtrl.listProducts(a.getId, filter)),format.raw/*22.69*/("""" class="list-group-item">"""),_display_(/*22.96*/a/*22.97*/.getGenre),format.raw/*22.106*/("""
            """),format.raw/*23.13*/("""<span class="badge">"""),_display_(/*23.34*/a/*23.35*/.getProducts.size()),format.raw/*23.54*/("""</span>
          </a>
        """)))}),format.raw/*25.10*/("""
      """),format.raw/*26.7*/("""</div>
    </div>
    <div class="col-sm-10">
        """),_display_(/*29.10*/if(flash.containsKey("success"))/*29.42*/ {_display_(Seq[Any](format.raw/*29.44*/("""
          """),format.raw/*30.11*/("""<div class="alert alert-success">
            """),_display_(/*31.14*/flash/*31.19*/.get("success")),format.raw/*31.34*/("""
          """),format.raw/*32.11*/("""</div>
        """)))}),format.raw/*33.10*/("""
  
        
        """),format.raw/*36.9*/("""<div id="actions">
          <form action=""""),_display_(/*37.26*/routes/*37.32*/.ProductCtrl.listProducts(artId)),format.raw/*37.64*/("""" method="GET">
           <input type="search" id="searchbox" name="filter" value=""""),_display_(/*38.70*/filter),format.raw/*38.76*/("""" placeholder="Filter by album name...">
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
    
      
      """),_display_(/*74.8*/for(p<-products) yield /*74.24*/{_display_(Seq[Any](format.raw/*74.25*/("""
        """),format.raw/*75.9*/("""<tr>


            """),_display_(/*78.14*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*78.101*/{_display_(Seq[Any](format.raw/*78.102*/("""
              """),format.raw/*79.15*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*79.70*/(p.getId + ".png ")),format.raw/*79.89*/(""""/></td>
            """)))}/*80.15*/else/*80.20*/{_display_(Seq[Any](format.raw/*80.21*/("""
              """),format.raw/*81.15*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
          """)))}),format.raw/*82.12*/("""   
          """),format.raw/*83.11*/("""<td>"""),_display_(/*83.16*/p/*83.17*/.getId),format.raw/*83.23*/("""</td>
          
          <td><a href=""""),_display_(/*85.25*/routes/*85.31*/.ProductCtrl.productDetails(p.getId)),format.raw/*85.67*/("""">
              """),_display_(/*86.16*/p/*86.17*/.getAlbum_name),format.raw/*86.31*/("""</td>
           </a>    
          <td>"""),_display_(/*88.16*/p/*88.17*/.getYear),format.raw/*88.25*/("""</td>
          <td>"""),_display_(/*89.16*/p/*89.17*/.getArt_name),format.raw/*89.29*/("""</td>
          <td>"""),_display_(/*90.16*/p/*90.17*/.getPrice),format.raw/*90.26*/("""</td>
          <td>"""),_display_(/*91.16*/p/*91.17*/.getStock),format.raw/*91.26*/("""</td>
          <td><a href=""""),_display_(/*92.25*/routes/*92.31*/.ShopCartCtrl.addToBasket(p.getId)),format.raw/*92.65*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
      """)))}),format.raw/*93.8*/("""
      
      """),format.raw/*95.7*/("""</tbody>
      
      </table>
      
      <p>
        <a href=""""),_display_(/*100.19*/routes/*100.25*/.AdminProductCtrl.addProduct()),format.raw/*100.55*/(""""> 
          <button class="btn btn-primary">Add a project</button>
        </a>
      </p>
    
""")))}),format.raw/*105.2*/("""
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
                  DATE: Fri Apr 06 16:43:25 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/listProducts.scala.html
                  HASH: b4723d4270814bbcc3c3bad353e051aaf5157767
                  MATRIX: 651->2|689->34|726->65|1124->93|1337->210|1366->214|1401->241|1440->243|1469->246|1742->492|1757->498|1814->534|1891->584|1924->601|1964->603|2003->614|2040->624|2055->630|2118->672|2172->699|2182->700|2213->709|2254->722|2302->743|2312->744|2352->763|2415->795|2449->802|2531->857|2572->889|2612->891|2651->902|2725->949|2739->954|2775->969|2814->980|2861->996|2909->1017|2980->1061|2995->1067|3048->1099|3160->1184|3187->1190|3760->1737|3792->1753|3831->1754|3867->1763|3914->1783|4011->1870|4051->1871|4094->1886|4176->1941|4216->1960|4257->1983|4270->1988|4309->1989|4352->2004|4468->2089|4510->2103|4542->2108|4552->2109|4579->2115|4647->2156|4662->2162|4719->2198|4764->2216|4774->2217|4809->2231|4877->2272|4887->2273|4916->2281|4964->2302|4974->2303|5007->2315|5055->2336|5065->2337|5095->2346|5143->2367|5153->2368|5183->2377|5240->2407|5255->2413|5310->2447|5446->2553|5487->2567|5581->2633|5597->2639|5649->2669|5779->2768
                  LINES: 24->2|25->3|26->4|31->5|36->5|39->8|39->8|39->8|40->9|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|56->25|57->26|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|67->36|68->37|68->37|68->37|69->38|69->38|105->74|105->74|105->74|106->75|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|113->82|114->83|114->83|114->83|114->83|116->85|116->85|116->85|117->86|117->86|117->86|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|124->93|126->95|131->100|131->100|131->100|136->105
                  -- GENERATED --
              */
          