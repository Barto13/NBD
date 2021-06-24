object Cw1_9 {

//  9.	Zdefiniuj funkcję, przyjmującą listę liczb całkowitych i
//  zwracającą wygenerowaną na jej podstawie listę, w której wszystkie liczby zostały zwiększone o 1. Wykorzystaj mechanizm mapowania kolekcji.

  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

  def incrementList(list:List[Int]) : List[Int] ={
      var newList = list.map{ case value => (value + 1)}
      return newList;
  }
}
