// Author : Rajan Gyawali

// Multi dimensional Arrays

import Array._

object Arrays{
	
	def main(args: Array[String]){

		var _4x4Matrix = ofDim[Int](4,4) 

		for (i <- 0 to 3){
			for (j <- 0 to 3){
				_4x4Matrix(i)(j) = i + j
			}
			
		}

		// Displaying the matrix

		for (i <- 0 to 3 ){
			for (j <- 0 to 3){
				print(_4x4Matrix(i)(j) + "	")
			}
			println()
		}
	}
}


// Arrays can be concatenated as well using the + operator.

/* 
	var myList1 = Array(1, 2, 3, 4)
	var myList2 = Array(5, 6, 7, 8)
	var myList3 = myList1 + myList2

*/