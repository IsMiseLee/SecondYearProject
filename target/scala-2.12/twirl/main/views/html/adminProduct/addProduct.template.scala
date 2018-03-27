
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
    """),_display_(/*18.6*/inputText(productForm("year"),'_label -> "Year", 'class -> "form-control")),format.raw/*18.80*/("""
    """),_display_(/*19.6*/inputText(productForm("type"),'_label -> "Type", 'class -> "form-control")),format.raw/*19.80*/("""
    """),_display_(/*20.6*/inputText(productForm("price"),'_label -> "Price", 'class -> "form-control")),format.raw/*20.82*/("""
    """),_display_(/*21.6*/inputText(productForm("stock"),'_label -> "Stock", 'class -> "form-control")),format.raw/*21.82*/("""
    
    """),format.raw/*23.5*/("""<label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  
    
    
    <div class="action"> 
      <input type="submit" value="Add Project" class="btn btn-primary">
      <a href=""""),_display_(/*31.17*/routes/*31.23*/.AdminProductCtrl.listProduct()),format.raw/*31.54*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    """)))}),format.raw/*39.6*/("""
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
                  DATE: Tue Mar 27 19:23:12 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/adminProduct/addProduct.scala.html
                  HASH: 1a4cdfea62d5ac865232e05660b61c1f9a0b5034
                  MATRIX: 664->2|702->34|1081->62|1226->137|1271->134|1299->153|1326->155|1360->181|1398->182|1430->188|1498->230|1643->365|1683->366|1717->373|1792->422|1805->426|1836->436|1873->447|1980->533|2012->539|2107->613|2139->619|2234->693|2266->699|2363->775|2395->781|2492->857|2529->867|2789->1100|2804->1106|2856->1137|3022->1273
                  LINES: 24->2|25->3|30->4|33->6|36->4|38->7|39->8|39->8|39->8|40->9|42->11|42->11|42->11|43->12|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|54->23|62->31|62->31|62->31|70->39
                  -- GENERATED --
              */
          