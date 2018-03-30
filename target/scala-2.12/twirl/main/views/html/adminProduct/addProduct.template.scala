
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
    
    """),_display_(/*11.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*11.141*/{_display_(Seq[Any](format.raw/*11.142*/("""
      """),format.raw/*12.7*/("""<div class="container">
          
        
    """),_display_(/*15.6*/CSRF/*15.10*/.formField),format.raw/*15.20*/("""
    
    """),_display_(/*17.6*/inputText(productForm("album_name"),'_label -> "Album name", 'class -> "form-control")),format.raw/*17.92*/("""

    """),_display_(/*19.6*/for((value, genre) <- Artist.options) yield /*19.43*/ {_display_(Seq[Any](format.raw/*19.45*/("""
      """),format.raw/*20.7*/("""<input type="checkbox" name="artSelect[]" value=""""),_display_(/*20.57*/value),format.raw/*20.62*/(""""
      
      />"""),_display_(/*22.10*/genre),format.raw/*22.15*/("""<br>        
  """)))}),format.raw/*23.4*/("""
    """),_display_(/*24.6*/inputText(productForm("year"),'_label -> "Year", 'class -> "form-control")),format.raw/*24.80*/("""
    """),_display_(/*25.6*/inputText(productForm("art_name"),'_label -> "Artist", 'class -> "form-control")),format.raw/*25.86*/("""
    """),_display_(/*26.6*/inputText(productForm("price"),'_label -> "Price", 'class -> "form-control")),format.raw/*26.82*/("""
    """),_display_(/*27.6*/inputText(productForm("stock"),'_label -> "Stock", 'class -> "form-control")),format.raw/*27.82*/("""
    
    """),format.raw/*29.5*/("""<label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  
    
    
    <div class="action"> 
      <input type="submit" value="Add Product" class="btn btn-primary">
      <a href=""""),_display_(/*37.17*/routes/*37.23*/.AdminProductCtrl.listProduct(0)),format.raw/*37.55*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    """)))}),format.raw/*45.6*/("""
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
                  DATE: Fri Mar 30 20:58:39 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/addProduct.scala.html
                  HASH: 555be2c5dd48758252b5e888d8b6702c6c64dcfa
                  MATRIX: 664->1|701->32|739->64|1118->92|1263->167|1308->164|1336->183|1363->185|1397->211|1435->212|1467->218|1535->260|1680->395|1720->396|1754->403|1829->452|1842->456|1873->466|1910->477|2017->563|2050->570|2103->607|2143->609|2177->616|2254->666|2280->671|2325->689|2351->694|2397->710|2429->716|2524->790|2556->796|2657->876|2689->882|2786->958|2818->964|2915->1040|2952->1050|3212->1283|3227->1289|3280->1321|3446->1457
                  LINES: 24->1|25->2|26->3|31->4|34->6|37->4|39->7|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|47->15|47->15|47->15|49->17|49->17|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|55->23|56->24|56->24|57->25|57->25|58->26|58->26|59->27|59->27|61->29|69->37|69->37|69->37|77->45
                  -- GENERATED --
              */
          