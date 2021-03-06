
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object brown_peterson_exp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[brownPeterson.Question,Integer,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(question : brownPeterson.Question,count : Integer,flashTime :Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.72*/("""
"""),_display_(Seq[Any](/*2.2*/header("Human Information Processing Lab :: Home Page"))),format.raw/*2.57*/("""
<body>
<!--FlashTime Container-->
<input class="inputNumberBox" id = "flashTime" name = "flashTime" type="text" disabled hidden value = """),_display_(Seq[Any](/*5.104*/flashTime)),format.raw/*5.113*/(""" />

<!-- Page Header -->
    <div class="">
          <h3 class="hipTitle"align="center" >Human Information Processing Lab</h3>
          <!-- Dashed line-->
          <div class="titleLine"></div>
    </div>
<div class="brownPeterson"></div>
<!-- Content -->
<div class="questionBox">
      <div align="center" class="questionWord" id="word1" style="visibility:hidden">"""),_display_(Seq[Any](/*16.86*/question/*16.94*/.firstWord)),format.raw/*16.104*/("""</div>
      <div align="center" class="questionWord" id="word2" style="visibility:hidden">"""),_display_(Seq[Any](/*17.86*/question/*17.94*/.secondWord)),format.raw/*17.105*/("""</div>
      <div align="center" class="questionWord" id="word3" style="visibility:hidden">"""),_display_(Seq[Any](/*18.86*/question/*18.94*/.thirdWord)),format.raw/*18.104*/("""</div>
</div>
<div class="rabbitContainer">
  <div id="hopRabbit"class="rabbit"></div>
  <div id="cloud" class="clouds"></div>
  <div id="counter" class="counterText" align="center">"""),_display_(Seq[Any](/*23.57*/count)),format.raw/*23.62*/("""</div>
</div>
<div class="answerBox">
    
  <span class="headerBox">คำตอบ</span>
  <span class="headerNumberBox">ใส่ตัวเลข</span>
        <form id = "answerForm" action=""""),_display_(Seq[Any](/*29.42*/routes/*29.48*/.BrownPeterson.renderShortTermMemoryBrownPetersonTaskExp())),format.raw/*29.106*/("""" method="post">
          <input class="inputBox" id = "firstWord" name = "firstWord" type="text" placeholder="      คำตอบ" disabled />
          <input class="inputBox" id = "secondWord" name = "secondWord" type="text" placeholder="      คำตอบ" disabled />
          <input class="inputBox" id = "thirdWord" name = "thirdWord" type="text" placeholder="     คำตอบ"  disabled />
          <input class="inputNumberBox" id = "countdownResult" name = "countdownResult" type="text" placeholder="  เลข" disabled />
          <input class="inputNumberBox" id = "usedTime" name = "usedTime" type="text" disabled hidden/>
          <input type="submit" class="sbutton" disabled id="SubmitButton" value="ยืนยัน" onclick="return submitButtonClick()"/>
        </form>
</div>
"""),_display_(Seq[Any](/*38.2*/footer())),format.raw/*38.10*/("""
"""))}
    }
    
    def render(question:brownPeterson.Question,count:Integer,flashTime:Integer): play.api.templates.HtmlFormat.Appendable = apply(question,count,flashTime)
    
    def f:((brownPeterson.Question,Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (question,count,flashTime) => apply(question,count,flashTime)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 03 13:43:36 ICT 2014
                    SOURCE: /Users/keepluck/HipLocal/app/views/brown_peterson_exp.scala.html
                    HASH: 4bcb12d7043b0244ac78ddf761058324b99bddf7
                    MATRIX: 819->1|983->71|1019->73|1095->128|1269->266|1300->275|1708->647|1725->655|1758->665|1886->757|1903->765|1937->776|2065->868|2082->876|2115->886|2334->1069|2361->1074|2569->1246|2584->1252|2665->1310|3467->2077|3497->2085
                    LINES: 26->1|29->1|30->2|30->2|33->5|33->5|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|51->23|51->23|57->29|57->29|57->29|66->38|66->38
                    -- GENERATED --
                */
            