package genericclasses

object GenericTest extends App {

  val stack = new Stack[Int]

  for(i<-1 until 10) stack.push(i)


  println(stack)
  println(stack.peak)
  println(stack)
  println(stack.pop)
  println(stack)


}
