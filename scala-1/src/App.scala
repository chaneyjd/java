object App extends App {

  trait laugh {
    def laugh = println("hahahaha")
  }

  class Person(val name: String) extends laugh {
    def talk(message: String) = println(name + " says " + message)
    def id(): String = name
  }

  class Employee(override val name: String, val number: Int) extends Person(name) with laugh {
    override def talk(message: String) {
      println(name + " with number " + number + " says " + message)
    }
    override def id(): String = number.toString
  }

  val employee = new Employee("Yoda", 4)
  employee.talk("Extend or extend not. There is no try.")

  val employee2 = new Employee("Luke", 7)
  employee2.talk("Use the force.")

  val person = new Person("Han")
  person.talk("Yeee Hawww")
  person.laugh

  println("------")

  val bart = new Kid().start
  val lisa = new Kid().start
  println("Ready to poke and feed...")
  bart ! Poke
  lisa ! Poke
  bart ! Feed
  lisa ! Feed
  bart ! Talk

}