package inheritance



class StringIterator(s:String) extends AbsIterator{

  type T=Char

  var i:Int=0

  println("StirngIterator class")
  def hasNext():Boolean= {
println("inheritance.StringIterator hasNext method")
    i < s.length
  }

  def next():Char={
    println("inheritance.StringIterator next method")
    val ch=s charAt i

    i+=1
    ch
  }


}