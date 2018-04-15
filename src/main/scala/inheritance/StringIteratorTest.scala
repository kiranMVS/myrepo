package inheritance

object StringIteratorTest extends App {

  println("StringIteratorTest object")

  class RichStingIter extends StringIterator("scala") with RichIterator{

    println("RichStringIter class")

  }


  val richStingIter = new RichStingIter

  richStingIter foreach println

}
