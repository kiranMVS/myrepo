package etractor

object ExtractorTest extends App {

  //val customerID = CustomerID("kiran")
  val customerID=CustomerID.apply("kiran")
  println(customerID)
  println(CustomerID.unapply(customerID).get)

  val customer2ID= CustomerID("ashok")
  println(customer2ID)

  val CustomerID(name)= customer2ID
  println(name)

  customerID match {

    case CustomerID(name)=>println(name)
    case _=>println("could'nt extract CustomerID")
  }

}
