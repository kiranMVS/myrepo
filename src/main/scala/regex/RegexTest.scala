package regex

import scala.util.matching.Regex

object RegexTest extends App {

  /*val numRegex:Regex= "[0-9]".r

  numRegex.findFirstMatchIn("awesomepassword123") match {

    case Some(_)=> println("Strong Password")
    case None => println("Password should contain atleast one digit")

  }*/

   val keyValuePattern:Regex = "([0-9a-zA-Z-#() ]+): ([0-9a-zA-Z-#() ]+)".r
  val input: String =
    """background-color: #A03300;
      |background-image: url(img/header100.png);
      |background-position: top center;
      |background-repeat: repeat-x;
      |background-size: 2160px 108px;
      |margin: 0;
      |height: 108px;
      |width: 100%;""".stripMargin

  for(patterMatch<-keyValuePattern.findAllMatchIn(input)){

    //println("-------------------------")
    //println(patterMatch.start)
    //println(patterMatch.groupNames)
    println(s"key:${patterMatch.group(1)} | value:${patterMatch.group(2)}")
    //println(patterMatch.groupCount)
    //println(patterMatch.end)
    //println("-------------------------")
  }


}
