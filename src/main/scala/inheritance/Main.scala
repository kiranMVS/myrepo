package inheritance

import scala.util.{Failure, Success, Try}

object Main {


  def main(args:Array[String]):Unit={

    val list:List[Any] =List(

      10,
      12.5f,
      true,
      "kiran",
      ()=>"this is an anonymous function"

    )

      list.foreach(println)



    val mapTest = Map("name"->"kiran", "age"->"26", "id"->"782540")

    //val value=mapTest.getOrElse("name","notvalid")
Try(mapTest.get("nae")) match {

      case Success(v) => println(v)

      case Failure(v)=> println(v)

    }
    println("completed")
  }


}
