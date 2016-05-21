// Author : Rajan Gyawali

// Scala Arrays

import Array._

object Arrays{
	
	def main(args : Array[String]){

		var myList = Array(24, 36, 14, 53, 42, 89, 76)

		// printing the items of an array

		for ( x <- myList){
			println(x)
		}


		// Summing each elements of an array myList

		var sum = 0
		for (i <- 0 to (myList.length - 1 )){
			sum += myList(i)
		}
		println(" The sum of the elemts of the myList = " + sum)

		// Finding the largest element of the array

		var max = myList(0)
		for(i <- 0 to (myList.length- 1 )){
			if (max < myList(i))
				max = myList(i)
		}
		println(" The largest number of the array is " + max)
	}
}