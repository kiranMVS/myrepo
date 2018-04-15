package nestedfunc

object Factorial extends App {

  def factorial(n:Int)={

    def fact(x:Int, acc:Int):Int={

      if(x==1) acc else fact(x-1, x*acc)

    }

    fact(n,1)
  }

  println(factorial(3))
  println(factorial(10))

}
