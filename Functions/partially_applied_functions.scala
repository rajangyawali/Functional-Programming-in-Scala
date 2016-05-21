// Author : Rajan Gyawali

// Scala Partially Applied Functions

// When you invoke a function you are said to be applying the function to the arguments. 
// If you pass all the expected arguments, then it is said you have fully applied it
// If you send only a few arguments then it is said to be partially applied functions 
// This gives you the convineience of binding somme arguments and leaving the rest to be filled in later 

import java.util.Date
object PartialFunction{
	def main(args : Array[String]){
		val date = new Date
		val logWithDateBound = log(date,_:String)

		logWithDateBound("Message 1 ")
		Thread.sleep(1000)

		logWithDateBound("Message 2 ")
		Thread.sleep(1000)


		logWithDateBound("Message 3 ")
		


	}

	def log(date : Date, message : String) = {
		println(date + "......................." + message)
	}
}



// The above program eliminates the need of calling the functions as 
/* 

	log(date, "Message 1")

	log(date, "Message 2")

	log(date, "Message 3")

*/