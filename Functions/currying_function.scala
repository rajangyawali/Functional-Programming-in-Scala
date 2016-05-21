// Author : Rajan Gyawali

// Scala Currying Functions

// Currying transforms a function that takes multiple parameters into a chain of functions, each taking a single parameter. 

object Currying{
	
	def main(args: Array[String]){

		println(strcat("Rajan ")("Gyawali"))
	}

	def strcat(s1 : String)(s2 : String) = s1 + s2
}