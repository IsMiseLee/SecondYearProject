
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
/*3.2*/import models.products.Artist
/*4.2*/import models.users.Member

object listProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],List[Artist],Member,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(products: List[Product], artists: List[Artist], member: Member,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.92*/("""

"""),_display_(/*7.2*/main("ListPRoducts",member)/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""
  """),format.raw/*8.3*/("""<h1>List of Albums</h1>
  <br>
  <div class="row">
    <div class="col-sm-3">
      <h4>Genres</h4>
      <div class="list-group">
        <a href=""""),_display_(/*14.19*/routes/*14.25*/.AdminProductCtrl.listProduct(0)),format.raw/*14.57*/("""" class="list-group-item">All Genres</a>
        """),_display_(/*15.10*/for(a <- artists) yield /*15.27*/ {_display_(Seq[Any](format.raw/*15.29*/("""
          """),format.raw/*16.11*/("""<a href=""""),_display_(/*16.21*/routes/*16.27*/.AdminProductCtrl.listProduct(a.getId)),format.raw/*16.65*/("""" class="list-group-item">"""),_display_(/*16.92*/a/*16.93*/.getGenre),format.raw/*16.102*/("""
            """),format.raw/*17.13*/("""<span class="badge">"""),_display_(/*17.34*/a/*17.35*/.getProducts.size()),format.raw/*17.54*/("""</span>
          </a>
        """)))}),format.raw/*19.10*/("""
      """),format.raw/*20.7*/("""</div>
    </div>
    <div class="col-sm-9">
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
    
      
      """),_display_(/*52.8*/for(p<-products) yield /*52.24*/{_display_(Seq[Any](format.raw/*52.25*/("""
        """),format.raw/*53.9*/("""<tr>


            """),_display_(/*56.14*/if(env.resource("public/images/productImages/thumbnails/"+ p.getId + ".png").isDefined)/*56.101*/{_display_(Seq[Any](format.raw/*56.102*/("""
              """),format.raw/*57.15*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*57.70*/(p.getId + ".png ")),format.raw/*57.89*/(""""/></td>
            """)))}/*58.15*/else/*58.20*/{_display_(Seq[Any](format.raw/*58.21*/("""
              """),format.raw/*59.15*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
          """)))}),format.raw/*60.12*/("""   
          """),format.raw/*61.11*/("""<td>"""),_display_(/*61.16*/p/*61.17*/.getId),format.raw/*61.23*/("""</td>
          <td>"""),_display_(/*62.16*/p/*62.17*/.getAlbum_name),format.raw/*62.31*/("""</td>
          <td>"""),_display_(/*63.16*/p/*63.17*/.getYear),format.raw/*63.25*/("""</td>
          <td>"""),_display_(/*64.16*/p/*64.17*/.getArt_name),format.raw/*64.29*/("""</td>
          <td>"""),_display_(/*65.16*/p/*65.17*/.getPrice),format.raw/*65.26*/("""</td>
          <td>"""),_display_(/*66.16*/p/*66.17*/.getStock),format.raw/*66.26*/("""</td>

          <td>
                <a href=""""),_display_(/*69.27*/routes/*69.33*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*69.73*/("""" class="button-xs btn-danger" onclick="">
                  <span class="glyphicon glyphicon-pencil"></span>
                 </a>
                </td>
              <td>    
                  <a href=""""),_display_(/*74.29*/routes/*74.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*74.75*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                      <span class="glyphicon glyphicon-trash"></span>
                    </a>
                  </td>
        
      """)))}),format.raw/*79.8*/("""
      
      """),format.raw/*81.7*/("""</tbody>
      
      </table>
      
      <p>
        <a href=""""),_display_(/*86.19*/routes/*86.25*/.AdminProductCtrl.addProduct()),format.raw/*86.55*/(""""> 
          <button class="btn btn-primary">Add a project</button>
        </a>
      </p>
    
""")))}),format.raw/*91.2*/("""
"""))
      }
    }
  }

  def render(products:List[Product],artists:List[Artist],member:Member,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,artists,member,env)

  def f:((List[Product],List[Artist],Member,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,artists,member,env) => apply(products,artists,member,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 05 20:45:24 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/listProduct.scala.html
                  HASH: 8fd73916261a301b0bce0208567e2da21254efe2
                  MATRIX: 664->2|702->34|739->65|1124->93|1309->183|1337->186|1372->213|1411->215|1440->218|1616->367|1631->373|1684->405|1761->455|1794->472|1834->474|1873->485|1910->495|1925->501|1984->539|2038->566|2048->567|2079->576|2120->589|2168->610|2178->611|2218->630|2281->662|2315->669|2748->1076|2780->1092|2819->1093|2855->1102|2902->1122|2999->1209|3039->1210|3082->1225|3164->1280|3204->1299|3245->1322|3258->1327|3297->1328|3340->1343|3456->1428|3498->1442|3530->1447|3540->1448|3567->1454|3615->1475|3625->1476|3660->1490|3708->1511|3718->1512|3747->1520|3795->1541|3805->1542|3838->1554|3886->1575|3896->1576|3926->1585|3974->1606|3984->1607|4014->1616|4089->1664|4104->1670|4165->1710|4397->1915|4412->1921|4473->1961|4701->2159|4742->2173|4835->2239|4850->2245|4901->2275|5030->2374
                  LINES: 24->2|25->3|26->4|31->5|36->5|38->7|38->7|38->7|39->8|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|51->20|83->52|83->52|83->52|84->53|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|100->69|100->69|100->69|105->74|105->74|105->74|110->79|112->81|117->86|117->86|117->86|122->91
                  -- GENERATED --
              */
          