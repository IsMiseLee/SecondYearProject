
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

object aboutUs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( member: models.users.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/main("Welcome to Play",member)/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Aural Soul</h1>

  
""")))}))
      }
    }
  }

  def render(member:models.users.Member): play.twirl.api.HtmlFormat.Appendable = apply(member)

  def f:((models.users.Member) => play.twirl.api.HtmlFormat.Appendable) = (member) => apply(member)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 15:57:11 IST 2018
                  SOURCE: /home/wdd/webapps/SecondYearProject/app/views/aboutUs.scala.html
                  HASH: 1952571da61f751289f337397fefe61d9ea2806f
                  MATRIX: 963->1|1088->31|1116->34|1154->64|1193->66|1222->69
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4
                  -- GENERATED --
              */
          