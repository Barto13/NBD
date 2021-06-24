object Cw1_5 {

//  5.	Stwórz mapę z nazwami produktów i cenami. Na jej podstawie wygeneruj drugą, z 10% obniżką cen. Wykorzystaj mechanizm mapowania kolekcji.

  val Products = Map("Cola" -> 5.00, "Sprite" -> 3.50, "Apple Juice" -> 2.00)
  val discountedProducts = Products.map{ case (key, value) => (key, value * 0.9)}
}
