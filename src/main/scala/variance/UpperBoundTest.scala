package variance

object UpperBoundTest extends App {

  class Cat extends Pet {
    def name:String= "cat"
  }

  class Dog extends Pet{
    override def name: String = "dog"
  }

  class Lion extends Animal{

    override def name: String = "lion"
  }

class PetContainer[P<:Pet](p:P){

  def pet:P=p
}

  val catContainer = new PetContainer[Cat](new Cat)
  val dogContainer = new PetContainer[Dog](new Dog)
  val lionContainer = new PetContainer[Lion](new Lion)

}

