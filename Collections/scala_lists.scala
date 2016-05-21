// Author : Rajan Gyawali

// Scala lists

/*
	lists are immutable.
	lists are linked lists while arrays are flats

*/

object ListsDemo{
	
	def main(args : Array[String]){

		// defining the lists

		val vehicles : List[String] = List("Aeroplane", "Bus", "Car", "Truck", "Jeep")

		println("The vehicles list is " + vehicles)

		// Another way of defining the list in Scala

		val num = List(1, 2, 3, 4, 5)

		println("The num list is " + num)

		// Defining an empty list is as follows

		val empty : List[Nothing] = List()

		// Defining the two dimensional list

		val matrix : List[List[Int]] = List(
												List(1, 2, 3),
												List(4, 5, 6),
												List(7, 8, 9)
											)

		println(" The matrix list is " + matrix)

		// Operations on lists

		println("The first elemnt of the list vehicles is "+ vehicles.head)
		println("The elemnts other than the first elemnt of the list vehicles is "+ vehicles.tail)

		// To check whether the list is empty or not?
		println("Is the list named empty is really empty ? " + empty.isEmpty)

		//Let us define the lists in another ways as follows

		val vehicles2 = "bicylcle" :: ("Motorbike" :: ("Tempo" :: Nil))

		println("The vehicles2 list is " + vehicles2)

		val num2 = 6 :: ( 7 :: (8:: (9 :: (10 :: Nil))))

		println("The num2 list is " + num2)

		// Methods on lists

		// Let us concatenate the lists

		val vehicles3 = List.concat(vehicles,vehicles2)
		println("The list of vehicles are " + vehicles3)

		val num3 = num ::: num2
		println(" The list of numbers after concatenation is " + num3)

		val str = vehicles3.:::(num3)
		println("The overall concatenation is "+ str)

		// Creating the uniform list

		val num4 = List.fill(20)(6)
		println("The uniform list is " + num4)

		// Tabulating the list

		val cubes = List.tabulate(10) (n => n *n * n)
		println("The first 10 cube numbers are " +  cubes)

		// Reversing the lists

		println("The reversed cube numbers are : " + cubes.reverse)

	}
}