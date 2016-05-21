// Author : Rajan Gyawali

// Scala Default Parameter Values

// This program simply multiplies two numbers


object Multiplication{
	
	def main(args: Array[String]){

		println("The multiplication of the numbers are ")
		println("The multiplication(3,8) is " + mul(3,8))
		println("The default multiplication is "+ mul())
		println("The multiplication with only one parameter is "+ mul(3))

	}


	def mul(a : Int = 5, b : Int = 12) : Int = {

		return a * b

	}
}