
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Member],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[models.users.Member],member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register",member)/*5.25*/{_display_(Seq[Any](format.raw/*5.26*/(""" 
    """),format.raw/*6.5*/("""<p class="lead">Add Product</p>
    
    """),_display_(/*8.6*/form(action=routes.ProductCtrl.registerSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*8.134*/{_display_(Seq[Any](format.raw/*8.135*/("""
      """),format.raw/*9.7*/("""<div class="container">
          
        
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    
    """),_display_(/*14.6*/inputText(registerForm("email"),'_label -> "Email", 'class -> "form-control")),format.raw/*14.83*/("""
    """),_display_(/*15.6*/inputText(registerForm("role"),'_label -> "Role", 'class -> "form-control")),format.raw/*15.81*/("""
    """),_display_(/*16.6*/inputText(registerForm("name"),'_label -> "Name", 'class -> "form-control")),format.raw/*16.81*/("""  
    """),_display_(/*17.6*/inputText(registerForm("password"),'_label -> "Password", 'class -> "form-control")),format.raw/*17.89*/("""

   
  
    
    
    """),format.raw/*23.5*/("""<div class="action"> 
      <input type="submit" value="Register" class="btn btn-primary">
      <a href=""""),_display_(/*25.17*/routes/*25.23*/.AdminProductCtrl.listProduct(0)),format.raw/*25.55*/(""""> 
        <button type="button" class="btn btn-warning">Cancel</button>
      </a>
    </div>
    </div>
      </body>
    
    
    """)))}),format.raw/*33.6*/("""
    """)))}))
      }
    }
  }

  def render(registerForm:Form[models.users.Member],member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(registerForm,member)

  def f:((Form[models.users.Member],models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (registerForm,member) => apply(registerForm,member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 30 20:58:38 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/register.scala.html
                  HASH: 6f3ec45c89077518ee87b5bf013d8f62c15afbb2
                  MATRIX: 990->1|1132->73|1177->70|1205->89|1232->91|1263->114|1301->115|1333->121|1400->163|1537->291|1576->292|1609->299|1684->348|1697->352|1728->362|1765->373|1863->450|1895->456|1991->531|2023->537|2119->612|2153->620|2257->703|2307->726|2441->833|2456->839|2509->871|2675->1007
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|48->16|49->17|49->17|55->23|57->25|57->25|57->25|65->33
                  -- GENERATED --
              */
          