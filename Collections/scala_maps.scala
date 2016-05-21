// Author : Rajan Gyawali

// Scala Maps

/*
	- It is a  collection of key- value pairs
	- Any value can be retrieb=ved based on the keys
	- Can be mutable or immutable like the sets

*/

object MapsDemo{
	def main(args: Array[String]){

		// Defining the maps 

		var A : Map[String, Int] = Map()

		// Adding items to the map

		A += ("Ram" -> 1)
		A += ("Hari" -> 2)
		A += ("Shyam" -> 1)
		A += ("Ujjwal" -> 4)

		// Accessing the keys of the map

		println("The Keys of the map A are "+A.keys)

		// Accessing the values of the map

		println("The Values of the map A are "+A.values)

		// To check whther the map contains the items or not

		println("Is map A empty ?" + A.isEmpty)

		// Defining Another map

		val B = Map("Physics" -> 80, "Mathematics" -> 99)
		println("The map b is " + B)

		// Concatenating maps

		val C = A ++ B // we can use Map.++(A,B) 0r A.++(B)

		println(" The concatenated map is " + C)

		// using iterators in the map

		C.keys.foreach{ i =>
							print("Key = "+ i )
							println("	Value = "+ C(i))

		}


		println("Does the key named Shyam exists in the Map C ?")
		println(C.contains("Shyam"))


	}
}