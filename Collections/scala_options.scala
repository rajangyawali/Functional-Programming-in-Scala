// Author : Rajan Gyawali

// Scala Options

// Scala Option[T] is a container for zero or one element of a given type.
// An Option[T] can be Some[T] or None object
// The get method of Scala's Map produces Some(value) if a value corresponding
// to a given key has found or None if the given key is not defined in the Map.

object OptionsDemo{
	
	def main(args : Array[String]){
		val holyBooks = Map("Hinduism" -> "Geeta", "Islam" -> "Quaran", "Christianity" -> "Bible")

		println("holyBooks.get(\"Hinduism\"): " + show(holyBooks.get("Hinduism")))
		println("holyBooks.get(\"Buddhism\"): " + show(holyBooks.get("Buddhism")))



		// Using getOrElse() Method

		val a : Option[Int] = Some(10)
		val b : Option[Int] = None

		println("a.getOrElse(0): " + a.getOrElse(0))
		println("b.getOrElse(10): " + b.getOrElse(10))

		// Using isEmpty() Method

		println("a.isEmpty : " + a.isEmpty)
		println("b.isEmpty : " + b.isEmpty)
	}

	def show(x : Option[String]) = x match{

		case Some(s) => s
		case None => "?"
	}
}