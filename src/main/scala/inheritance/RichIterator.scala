package inheritance

trait RichIterator extends AbsIterator{

  println("RichIterator trait")

  def foreach(f:T=>Unit)= {

println("RichIterator foreach method")

    while (hasNext) f(next())
  }

}
