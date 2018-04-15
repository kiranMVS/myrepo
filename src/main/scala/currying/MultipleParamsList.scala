package currying

object MultipleParamsList extends App{

  val x= (1 to 20).toList

  println(x.fold(0)((x,y)=>x+y))
}
