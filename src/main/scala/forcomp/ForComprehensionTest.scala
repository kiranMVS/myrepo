package forcomp

object ForComprehensionTest extends App {

  case class User(name:String, age:Int)

  val userList = List(new User("kiran",26),
    new User("ashok", 26),
    new User("kanhu", 38),
    new User("karan", 40))

  val belowThirty = for(user<- userList if(user.age<30)) yield user.name

  belowThirty.foreach(println)

  userList.foreach{

    case user:User=>println(s"${user.name} ${user.age}")
    case _=> println("not found")

  }

  def foo(n:Int, v:Int)={

    for (i<-0 until n;
    j<- i until n if i+j ==v) yield (i,j)

  }

  foo(10, 10) foreach {
    case (i, j) =>
      print(s"($i, $j) ")  // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5)
  }


}
