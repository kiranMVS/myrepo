package variance

object CovariantTest extends App {


  case class Cat(name:String) extends Animal
  case class Dog(name:String) extends Animal


  def printAnimalNames(animals:List[Animal]):Unit={

    animals.foreach{
      animal=>println(animal.name)
    }

  }

  val cats = List(new Cat("sonu"), new Cat("catty"))
  val dogs= List(new Dog("jimmy"), new Dog("tommy"))

  printAnimalNames(cats)
  printAnimalNames(dogs)
}
