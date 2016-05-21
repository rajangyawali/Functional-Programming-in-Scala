// Author: Rajan Gyawali

// Scala Iterators

/*
An Iterator is not an actual collection but rather a way of accessing the elemnets of a collection 
one by one
- two basic operations are next() and hasNext()
*/

object IteratorDemo{
	def main(args : Array[String]){

		val i = Iterator("a", "b", "c", "d")
		while(i.hasNext){
		println(i.next())
		}

		val i1 = Iterator(1,23,17,12,45,32)
		val i2 =Iterator(1,23,17,12,45,32)
		// Printing the max and min elements
		println("The maximum value is : " + i1.max)
		println("The minimum  value is : " + i2.min)
		println("The length of the Iterator i is : " + i.size)
		println("The length of the Iterator i1 is: " +i1.length)

		// The iterator can be transversed only once.

		val i3 = Iterator(1,23,17,12,45,32)
		val i4 =Iterator(1,23,17,12,45,32)

		println("The length of the Iterator i3 is: " +i3.length)
		println("The length of the Iterator i4 is : " + i4.size)
	}
}