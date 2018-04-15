package genericclasses

class Stack[A] {

 private var elements:List[A]=Nil
  def push(a:A)={elements=a :: elements}
  def peak:A= elements.head
  def pop:A= {
    val topElement = peak
    elements=elements.tail
    topElement
  }

}
