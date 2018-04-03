
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
/*1.2*/import models.products.Artist
/*2.2*/import models.products.Product
/*3.2*/import models.users.Member

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.Product],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(productForm: Form[models.products.Product],member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._


Seq[Any](format.raw/*4.74*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Add Project",member)/*8.28*/{_display_(Seq[Any](format.raw/*8.29*/(""" 
    """),format.raw/*9.5*/("""<p class="lead">Add Product</p>
    
    """),_display_(/*11.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-vertical", 'role -> "form",'enctype -> "multipart/form-data")/*11.139*/{_display_(Seq[Any](format.raw/*11.140*/("""
      """),format.raw/*12.7*/("""<div class="container">
          
        
    """),_display_(/*15.6*/CSRF/*15.10*/.formField),format.raw/*15.20*/("""
    
    """),format.raw/*17.5*/("""<div class="form-group">
        """),_display_(/*18.10*/inputText(productForm("album_name"), '_label -> "", 
        'class -> "form-control input-xs", 'placeholder -> "Album name")),format.raw/*19.73*/("""
    """),format.raw/*20.5*/("""</div>

    """),_display_(/*22.6*/for((value, genre) <- Artist.options) yield /*22.43*/ {_display_(Seq[Any](format.raw/*22.45*/("""
      """),format.raw/*23.7*/("""<input type="checkbox" name="artSelect[]" value=""""),_display_(/*23.57*/value),format.raw/*23.62*/(""""
      
      />"""),_display_(/*25.10*/genre),format.raw/*25.15*/("""<br>        
  """)))}),format.raw/*26.4*/("""
  """),format.raw/*27.3*/("""<div class="form-group">
      """),_display_(/*28.8*/inputText(productForm("year"), '_label -> "", 
      'class -> "form-control input-xs", 'placeholder -> "Year")),format.raw/*29.65*/("""
  """),format.raw/*30.3*/("""</div>
  
    <div class="form-group">
        """),_display_(/*33.10*/inputText(productForm("art_name"), '_label -> "", 
        'class -> "form-control input-xs", 'placeholder -> "Artist")),format.raw/*34.69*/("""
    """),format.raw/*35.5*/("""</div>
    <div class="form-group">
        """),_display_(/*37.10*/inputText(productForm("price"), '_label -> "", 
        'class -> "form-control input-xs", 'placeholder -> "Price")),format.raw/*38.68*/("""
    """),format.raw/*39.5*/("""</div>

    <div class="form-group">
        """),_display_(/*42.10*/inputText(productForm("stock"), '_label -> "", 
        'class -> "form-control input-xs", 'placeholder -> "Stock")),format.raw/*43.68*/("""
    """),format.raw/*44.5*/("""</div>
  
    
    <label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  
    
    
    <div class="action"> 
      <input type="submit" value="Add Product" class="btn btn-primary">
      <a href=""""),_display_(/*55.17*/routes/*55.23*/.AdminProductCtrl.listProduct(0)),format.raw/*55.55*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    """)))}),format.raw/*63.6*/("""
    """)))}))
      }
    }
  }

  def render(productForm:Form[models.products.Product],member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(productForm,member)

  def f:((Form[models.products.Product],models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (productForm,member) => apply(productForm,member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 03 18:15:32 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/addProduct.scala.html
                  HASH: 29bfa303b349c3aaad8a8801ef3e209a6a1af179
                  MATRIX: 664->1|701->32|739->64|1118->92|1263->167|1308->164|1336->183|1363->185|1397->211|1435->212|1467->218|1535->260|1678->393|1718->394|1752->401|1827->450|1840->454|1871->464|1908->474|1969->508|2115->633|2147->638|2186->651|2239->688|2279->690|2313->697|2390->747|2416->752|2461->770|2487->775|2533->791|2563->794|2621->826|2753->937|2783->940|2858->988|2998->1107|3030->1112|3102->1157|3238->1272|3270->1277|3343->1323|3479->1438|3511->1443|3790->1695|3805->1701|3858->1733|4024->1869
                  LINES: 24->1|25->2|26->3|31->4|34->6|37->4|39->7|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|47->15|47->15|47->15|49->17|50->18|51->19|52->20|54->22|54->22|54->22|55->23|55->23|55->23|57->25|57->25|58->26|59->27|60->28|61->29|62->30|65->33|66->34|67->35|69->37|70->38|71->39|74->42|75->43|76->44|87->55|87->55|87->55|95->63
                  -- GENERATED --
              */
          