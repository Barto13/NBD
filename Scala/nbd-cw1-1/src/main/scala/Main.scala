import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor.Work

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")


    //Cwiczenia1_1
    val Days: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    val cw1_1 = Cw1_1;
    println("-----Cwiczenie1_1-----")
    println("Using for: " + cw1_1.printUsingFor(Days))
    println("Using for, but starting with P : " + cw1_1.printStartingWithP(Days))
    println("Using while: " + cw1_1.printUsingWhile(Days))

    //Cwiczenia1_2
    val cw1_2 = Cw1_2;
    println("-----Cwiczenie1_2-----")
    println("Using recursion: " + cw1_2.printUsingRecursion(Days, 6))
    println("Using recursion from last to first: " + cw1_2.printUsingRecursionLastToFirst(Days, 6))

    //Cwiczenia1_3
    val cw1_3 = Cw1_3;
    println("-----Cwiczenie1_3-----")
    println("Using tail recursion: " + cw1_3.printUsingTailRecursion(Days, 6))

    //Cwiczenia1_4
    val cw1_4 = Cw1_4
    println("-----Cwiczenie1_4-----")
    println("Using fold left: " + cw1_4.printWithfoldleft(Days))
    println("Using fold right: " + cw1_4.printWithfoldright(Days))
    println("Using fold left, but starting with P : " + cw1_4.printWithfoldleftStartingWithP(Days))

    //Cwiczenia1_5
    val cw1_5 = Cw1_5
    println("-----Cwiczenie1_5-----")
    println("Map of products before discount: " + cw1_5.Products)
    println("Map of products after discount: " + cw1_5.discountedProducts)

    //Cwiczenia1_6
    val cw1_6 = Cw1_6
    println("-----Cwiczenie1_6-----")
    println(cw1_6.printTupleContent(cw1_6.tuple))

    //Cwiczenia1_7
    val cw1_7 = Cw1_7
    println("-----Cwiczenie1_7-----")
    println("Price of Cola: " + cw1_7.showPrice(cw1_5.Products.get("Cola")))
    println("Price of Pepsi: " + cw1_7.showPrice(cw1_5.Products.get("Pepsi")))

    //Cwiczenia1_8
    val cw1_8 = Cw1_8
    println("-----Cwiczenie1_8-----")
    println("List: " + cw1_8.list)
    println("List without 0: " + cw1_8.removeZeros(cw1_8.list))

    //Cwiczenia1_9
    val cw1_9 = Cw1_9
    println("-----Cwiczenie1_9-----")
    println("List: " + cw1_9.list)
    println("Incremented list: " + cw1_9.incrementList(cw1_9.list))

    //Cwiczenia1_10
    val cw1_10 = Cw1_10
    println("-----Cwiczenie1_10-----")
    println("List: " + cw1_10.list)
    println("Filtered list: " + cw1_10.calculateAbsoluteValues(cw1_10.list))

    //Cwiczenie2_1
    val cw2_1 = Cw2_1
    println("-----Cwiczenie2_1-----")
    println("Example work day: " + cw2_1.matchWeekDay("Poniedzialek"))
    println("Example free day: " + cw2_1.matchWeekDay("Niedziela"))
    println("Example unknown day: " + cw2_1.matchWeekDay("aaa"))

    //Cwiczenie2_2
    val cw2_2_1 = new BankAccount
    val cw2_2_2 = new BankAccount(500.00)
    println("-----Cwiczenie2_2-----")
    println("Bank account no arg constructor: " + cw2_2_1.balance)
    println("Bank account with arg constructor: " + cw2_2_2.balance)
    println("Bank account(with 0 starting money) after 700.00 deposited: " + cw2_2_1.deposit(700.00).balance)
    println("Bank account(with 500.00 starting money) after 300.00 withdrawn: " + cw2_2_2.withdraw(300.00).balance)

    //Cwiczenie2_3
    println("-----Cwiczenie2_3-----")
    val cw2_3 = Cw2_3
    val person1 = new Person("Adam", "Jakis")
    val person2 = new Person("Jacek", "Nowak")
    val person3 = new Person("Anna", "Kowalska")
    println("Greeting person nr 1: " + cw2_3.greetPerson(person1))
    println("Greeting person nr 2: " + cw2_3.greetPerson(person2))
    println("Greeting person nr 3: " + cw2_3.greetPerson(person3))

    //Cwiczenie2_4
    println("-----Cwiczenie2_4-----")
    val cw2_4 = Cw2_4
    println("Result of calling function x*2, 3 times for x=2: " + cw2_4.doFunction(cw2_4.arithmeticFunc, 2))

    //Cwiczenie2_5
    println("-----Cwiczenie2_5-----")
    val person_student = new Person2("studentName", "studentSurname") with Student
    println("Tax for Person2 with student trait: " + person_student.tax)

    val person_worker = new Person2("workerName", "workerSurname") with Worker
    person_worker.salary = 1000.0
    println("Tax for Person2 with worker trait: " + person_worker.tax)

    val person_teacher = new Person2("teacherName", "teacherSurname") with Teacher
    person_teacher.salary = 1000.0
    println("Tax for Person2 with teacher trait: " + person_teacher.tax)

    val person_student_worker = new Person2("teacherName", "teacherSurname") with Student with Worker
    person_student_worker.salary = 1000.0
    println("Tax for Person2 with student - worker trait: " + person_student_worker.tax)

    val person_worker_student = new Person2("teacherName", "teacherSurname") with Worker with Student
    person_worker_student.salary = 1000.0
    println("Tax for Person2 with worker - student trait: " + person_worker_student.tax)


  }




}
