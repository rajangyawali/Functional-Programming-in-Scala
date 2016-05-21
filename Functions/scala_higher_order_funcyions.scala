// Author: Rajan Gyawali

// Scala Higher Order Functions

// These are the functions that take other functions as parameters or whose result is a function.


object Test {
	def main(args : Array[String]){

		println(apply(layout,10))

	}

	def apply(f : Int => String, v : Int) = f(v)

	def layout[A](x:A) = "[" + x.toString() + "]"
}