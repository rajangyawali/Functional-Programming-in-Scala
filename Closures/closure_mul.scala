// Author : Rajan Gyawali

// Scala Closures

// A closure is a function whose return value depends  on the value of one or more variable declared outside the function.

object Closure{
	
	def main(args : Array[String]){

		println("multiplier(1) value is " + multiplier(1))
		println("multiplier(5) value is " + multiplier(5))
		println("multiplier(15) value is " + multiplier(15))
	}

	var factor = 3
	val multiplier = (i : Int ) => i * factor
}