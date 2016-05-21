object test{
	def main(args : Array[String]){
	println("The sum of the numbers = " + add(2,3))
	println("The sum of the numbers = " + add())
	println("The sum of the numbers = " + add(2))
	println("The sum of the numbers = " + add(7,8))
	println("The delayed time is "+ delayed(time()))
	}

	def add(a :Int = 3, b : Int = 6) : Int = {
	return a + b
	}


	def time() = {
	println("Displaying the time in nanoseconds")
	System.nanoTime()
	}

	def delayed(t : => Long) = {
	println("Calling the time function")
	println("Delay of " + t)
	}

	
}

