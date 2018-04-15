package variance

object ContravariantTest extends App {

  class AnimalPrinter extends Printer[Animal]{

    def print(animal: Animal):Unit={

      println(s"The animal's name is ${animal.name}")

    }

  }

  case class Cat(name:String) extends Animal

  class CatPrinter extends Printer[Cat]{

    override def print(value: Cat): Unit = {

      println(s"This cat's name is ${value.name}")

    }
  }

  val mycat = Cat("sonu")

  def printMyCat(printer: Printer[Cat]):Unit={
    printer.print(mycat)
  }

    val catPrinter= new CatPrinter
    val animalPrinter= new AnimalPrinter

  printMyCat(catPrinter)
  printMyCat(animalPrinter)
}
