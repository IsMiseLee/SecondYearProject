
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.Product],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.products.Product],member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Project",member)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/(""" 
    """),format.raw/*6.5*/("""<p class="lead">Add Product</p>
    
    """),_display_(/*8.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.107*/{_display_(Seq[Any](format.raw/*8.108*/("""
      """),format.raw/*9.7*/("""<div class="container">
          
        
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    
    """),_display_(/*14.6*/inputText(productForm("album_name"),'_label -> "Album name", 'class -> "form-control")),format.raw/*14.92*/("""
    """),_display_(/*15.6*/inputText(productForm("year"),'_label -> "Year", 'class -> "form-control")),format.raw/*15.80*/("""
    """),_display_(/*16.6*/inputText(productForm("type"),'_label -> "Type", 'class -> "form-control")),format.raw/*16.80*/("""
    """),_display_(/*17.6*/inputText(productForm("price"),'_label -> "Price", 'class -> "form-control")),format.raw/*17.82*/("""
    """),_display_(/*18.6*/inputText(productForm("stock"),'_label -> "Stock", 'class -> "form-control")),format.raw/*18.82*/("""
    
    """),format.raw/*20.5*/("""<label>Image Upload</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br><br>
  
    
    
    <div class="action"> 
      <input type="submit" value="Add Project" class="btn btn-primary">
      <a href=""""),_display_(/*28.17*/routes/*28.23*/.ProductCtrl.listProduct()),format.raw/*28.49*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    """)))}),format.raw/*36.6*/("""
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
                  DATE: Mon Mar 19 17:23:25 GMT 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/addProduct.scala.html
                  HASH: 5bb21f7162aeb08e44beb88d43886fb76bbaee86
                  MATRIX: 996->1|1141->76|1186->73|1214->92|1241->94|1275->120|1313->121|1345->127|1412->169|1522->270|1561->271|1594->278|1669->327|1682->331|1713->341|1750->352|1857->438|1889->444|1984->518|2016->524|2111->598|2143->604|2240->680|2272->686|2369->762|2406->772|2666->1005|2681->1011|2728->1037|2894->1173
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|50->18|50->18|52->20|60->28|60->28|60->28|68->36
                  -- GENERATED --
              */
          