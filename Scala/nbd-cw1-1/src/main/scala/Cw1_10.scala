object Cw1_10 {

//  10.	Stwórz funkcję przyjmującą listę liczb rzeczywistych i zwracającą stworzoną na jej podstawie listę zawierającą
//  wartości bezwzględne elementów z oryginalnej listy należących do przedziału <-5,12>. Wykorzystaj filtrowanie.

  val list = List(-7, -6,-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)


  def calculateAbsoluteValues(list:List[Int]) : List[Int] ={
      var filteredList = list.filter(x => x >= -5 && x <= 12).map{case x => x.abs}
      return filteredList;
  }

}
