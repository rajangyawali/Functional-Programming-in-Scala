// Author : Rajan Gyawali

// Scala Sets

/*

	- Scala is a collection of pairwise different elements of the same type.
	- can be mutable or immutable
	- by default scala uses immutable set
	- to make it mutable we have to import scala.collection.mutable.set


*/

object SetsDemo{
	
	def main(args : Array[String]){

		// Defining the sets

		var s1 = Set(2, 3, 5, 7, 11, 13, 17, 19)

		println("The set s1 is " + s1)

		// Defining the another set s2

		var s2 : Set[Int] = Set(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

		println("The set s1 is " + s1)

		// Basic operations on sets

		println("The head element of s1 is " +  s1.head)
		println("The tail elemnnts of s2 is " + s2.tail)
		println("Is set s1 empty ? " + s1.isEmpty)

		// Concatenating the sets s1 and  s2

		var s3 = s1 ++ s2
		println("The concatenated set of s1 and s2 is "+ s3)

		// Finding max and min values of the sets.

		println("The max number in the set1 is "+ s1.max)
		println("The min number in the set2 is "+ s2.min)

		// Finding the common elemnts in the sets s1 and s2

		println("The common elemnts in the s1 and  s2 are " + s1.intersect(s2)) // we can often use s1.&(s2)
	}
}