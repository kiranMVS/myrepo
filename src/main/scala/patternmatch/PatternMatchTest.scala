package patternmatch

object PatternMatchTest extends App {

  case class Email(sender:String, title:String,message:String) extends Notification
  case class SMS(number:String, msg:String) extends  Notification
  case class VoiceMsg(name:String, link:String) extends Notification

  def showNotification(notification: Notification):String={


    notification match {

      case Email(sender,title,_)  => s"you got an email from $sender with subject $title"

      case SMS(number,msg) =>s"$number sent you a message $msg "
      case VoiceMsg(name,link) =>s"you got a voice message from $name. To listen click on the link $link"

    }

  }

  def showImpNotification(notification:Notification, impList:List[String]):String={

    notification match {

      case Email(sender,title,_) if(impList.contains(sender)) =>
        s"you got an email from special person $sender with subject $title"

      case SMS(number,msg) if(impList.contains(number))=>s"You got a special message $msg from $number"
      case VoiceMsg(name,link) if(impList.contains(name))=>s"you got a special voice message from $name. To listen click on the link $link"
      case other => showNotification(other)
    }



  }

  val impList = List("manager@apple.com", "7090477565" ,"Infy")

  val email1 = Email("kiran@infosys.com", "Status Email", "On Bench")
  val email2 = Email("manager@apple.com", "Status Email", "completed")
  val sms= SMS("7090477565","Hi..! How are you?")
  val voice = VoiceMsg("Infy","https://iconnect/voice")

  println(showImpNotification(email1, impList))
  println(showImpNotification(email2, impList))
  println(showImpNotification(sms, impList))
  println(showImpNotification(voice, impList))

}
