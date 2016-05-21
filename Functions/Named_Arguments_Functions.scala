
// Author : Rajan Gyawali

// Scala functions with Named Arguments

object test{
	def main(args : Array[String]){
	println("The sum of the numbers = " + add(2,3))
	println("The sum of the numbers = " + add())
	println("The sum of the numbers = " + add(2))
	println("The sum of the numbers = " + add(7,8))
	}

	def add(a :Int = 3, b : Int = 6) : Int = {
	return a + b
	}
}
