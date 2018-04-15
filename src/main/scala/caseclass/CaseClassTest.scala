package caseclass

import com.sun.xml.internal.ws.client.sei.ResponseBuilder.Body

object CaseClassTest extends App {

  val msg1=  Message("kiran@gmail.com", "ashok@gmail.com", "Hi! How are you?")
  val msg2=  Message("kiran@gmail.com", "ashok@gmail.com", "Hi! How are you?")

  println(msg1==msg2)

  val msg3 = Message("messenger@infosys.com","kiran@infosys.com","Today is holiday")
  val msg4= msg3.copy(sender=msg3.reciever, "ashok@infosys.com")
  println(msg4)


}

 case class Message(sender:String, reciever:String, body: String)