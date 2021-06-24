object Cw1_2 {

//  2.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
//    a.	Funkcji rekurencyjnej
//      b.	Funkcji rekurencyjnej wypisując elementy listy od końca


  def printUsingRecursion( a:List[String], i: Int) : String = {

    if (i == 0){
      a(i)
    } else {
      printUsingRecursion(a, i-1) + ", " + a(i)
    }
  }

  def printUsingRecursionLastToFirst ( a:List[String], i: Int) : String ={

    if (i == 0){
      a(i)
    } else {
      a(i) + ", " + printUsingRecursionLastToFirst(a, i-1)
    }
  }
}
