// Author : Rajan Gyawali

// Scala Tuples

/*
	- they combine a fixed number of items together.
	- they hold objects with different types
	- they are immutable

*/

object TuplesDemo{
	
	def main(args: Array[String]){

		// Defining Tuples

		val x = new Tuple3(1, "Ram", "Mango")
		val y = new Tuple4(2, "Shyam", "Apple", "Mathematics")

		// You can have tuples upto the size of 22 in Scala by default.

		// Acessing the elemnts of tuple

		println(x._2)
		println(y._3)

		val num = Tuple6(1, 2, 3, 4, 5, 6)
		val sum = num._1 + num._2 + num._3 + num._4 + num._5 + num._6
		println("The sum of the elements in the tuple " + num + " is: " + sum )

		// Iterating over the elements of tuple
		println("Iterating through the elements of num tuple")
		num.productIterator.foreach{
										i => println(" value = "+ i)
		}

		// Converting tuples into string

		println("The converted string of the tuple num is : "+ num.toString())

		// Swapping the elemnts of the tuple
		val s = Tuple2(3,5)
		println("The swapped tuple of the" + s + " is : "+ s.swap)
	}
}