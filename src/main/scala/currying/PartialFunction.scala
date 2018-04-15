package currying

object PartialFunction extends App {

  val numbers = (1 to 20).toList
  val numberFunc= numbers.foldLeft(List[Int]())_
  val squares = numberFunc((xs,x)=>xs:+x*x)
  val cubes = numberFunc((xs,x)=>xs:+x*x*x)

  println(squares)
  println(cubes)
}
