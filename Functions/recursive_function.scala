// Author : Rajan Gyawali

// Scala Recursion Functions

// It plays a big role in pure functional programming.

object Factorial{
	
	def main(args: Array[String]){

	println("Factorial of the number 5 is "+ fact(5))
	println("Factorial of the number 8 is "+ fact(8))
	println("Factorial of the number 12 is "+ fact(12))
	}


	def fact(n : BigInt) : BigInt = {

		if (n <= 1){
		1
		}

		else{
		n * fact(n - 1)
		}

	}
}
