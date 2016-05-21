// Author : Rajan Gyawali

// Scala Nested Functions

object Nested{
	
	def main(args : Array[String]){

		println(factorial(0))
		println(factorial(2))
		println(factorial(8))
	}

	def factorial(i : BigInt) : BigInt = {

		def fact(i : BigInt, accum : BigInt): BigInt = {
			if (i <= 1)
			accum
			else
			fact(i-1, i * accum)
		}

		fact(i,1)
	}
}