//Author : Rajan Gyawali

// Scala function with variable arguments:

object Addition{
	def main(args: Array[String]){
	println("The addition of the two numbers are; " + addNum(2,3))
	println("The addition of the three numbers are; " + addNum(2,3,4))
	println("The addition of the four numbers are; " + addNum(2,3,8,12))
	println("The addition of the five numbers are; " + addNum(2,3,10,15,13))
	}


	def addNum(args: Int*): Int = {
	var sum: Int = 0
	for (arg <- args){
	sum += arg
	}
	}
}