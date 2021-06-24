object Cw2_4 {

//  4.	Zdefiniuj funkcję przyjmującą dwa parametry -
//    wartość całkowitą i funkcję operującą na wartości całkowitej.
//  Zastosuj przekazaną jako parametr funkcję trzykrotnie do wartości całkowitej i zwróć wynik.

  def doFunction(f: Int => Int, x: Int): Int ={
    f( f (f(x) ) )
  }

  def arithmeticFunc(number: Int): Int ={
    number * 2
  }

}
