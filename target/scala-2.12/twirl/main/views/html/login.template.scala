
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.68*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login",member)/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<p class="lead">Product </p>
    <div class="col-xs-5">
        <h3>Sign in</h3>
        """),_display_(/*8.10*/if(loginForm.hasGlobalErrors)/*8.39*/ {_display_(Seq[Any](format.raw/*8.41*/("""
            """),format.raw/*9.13*/("""<p class="alert alert-warning">
                """),_display_(/*10.18*/loginForm/*10.27*/.globalError.message),format.raw/*10.47*/(""";
            </p>
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/if(flash.containsKey("error"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
            """),format.raw/*14.13*/("""<p class="alert alert-warning">
                """),_display_(/*15.18*/flash/*15.23*/.get("loginRequired")),format.raw/*15.44*/("""
            """),format.raw/*16.13*/("""</p>
        """)))}),format.raw/*17.10*/("""


        """),_display_(/*20.10*/helper/*20.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*20.74*/ {_display_(Seq[Any](format.raw/*20.76*/("""
            """),_display_(/*21.14*/CSRF/*21.18*/.formField),format.raw/*21.28*/("""

            """),format.raw/*23.13*/("""<div class="form-group">
                """),_display_(/*24.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*25.76*/("""
            """),format.raw/*26.13*/("""</div>
            <div class="form-group">
                """),_display_(/*28.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*29.79*/("""
            """),format.raw/*30.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,member)

  def f:((Form[models.users.Login],models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,member) => apply(loginForm,member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 15:57:11 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/login.scala.html
                  HASH: 75d95c3331025b9d46b48d00fb6be7ca2bf12882
                  MATRIX: 986->1|1125->69|1170->67|1197->85|1224->87|1252->107|1291->109|1322->114|1438->204|1475->233|1514->235|1554->248|1630->297|1648->306|1689->326|1748->354|1785->364|1824->394|1864->396|1905->409|1981->458|1995->463|2037->484|2078->497|2123->511|2162->523|2177->529|2244->587|2284->589|2325->603|2338->607|2369->617|2411->631|2480->673|2622->794|2663->807|2751->868|2903->999|2944->1012|3125->1162|3157->1167
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|52->20|52->20|52->20|52->20|53->21|53->21|53->21|55->23|56->24|57->25|58->26|60->28|61->29|62->30|66->34|67->35
                  -- GENERATED --
              */
          