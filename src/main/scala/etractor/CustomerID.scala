package etractor

import scala.util.Random

object CustomerID {

  def apply(name:String):String={

    s"$name--${Random.nextLong()}"

  }

  def unapply(customerID: String): Option[String] ={

    val name=customerID.split("--").head
    if(name.nonEmpty) Some(name) else None

  }


}
