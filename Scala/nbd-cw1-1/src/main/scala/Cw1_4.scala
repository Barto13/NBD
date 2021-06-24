object Cw1_4 {

//  4.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami korzystając z:
//    a.	Metody foldl
//      b.	Metody foldr
//      c.	Metody foldl wypisując tylko dni z nazwami zaczynającymi się na „P”

  def printWithfoldleft(a:List[String]) : String ={
    var result = a.foldLeft(""){(x, y) => x + y + ", "};
    result.substring(0, result.length - 2);
  }

  def printWithfoldright(a:List[String]) : String ={
    var result = a.foldRight(""){(x, y) => x + ", " + y };
    result.substring(0, result.length - 2);
  }

  //najpierw filtr potem fold
  def printWithfoldleftStartingWithP(a:List[String]) : String ={
    var result = a.filter(y => y.startsWith("P")).foldLeft(""){(x, y) =>  x + ", " + y };

//    var result = a.foldLeft(""){(x, y) => if(y.startsWith("P")) x + ", " + y  else x };
    result.substring(2, result.length);
  }
}
