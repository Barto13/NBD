object Cw1_7 {

//  7.	Zaprezentuj działanie Option na dowolnym przykładzie (np. mapy, w której wyszukujemy wartości po kluczu)

  def showPrice(map: Option[Double]) = map match {
    case Some(s) => s
    case None => "Product does not exist!"
  }

}
