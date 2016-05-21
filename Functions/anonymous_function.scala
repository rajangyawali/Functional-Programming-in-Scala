// Author : Rajan Gyawali

// Scala Anonymous functions

// This is a light weight syntax for writing functions. They are called function literals and at the run time they are instantiated
// into objects called function values

object Test{
	def main(args : Array[String]){

		var mul = (x: Int, y : Int) => x * y

		var add = (x : Int, y : Int, z : Int) => x + y + z

		println(mul(3,4))
		println(add(6,7,8))
	}
}