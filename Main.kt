fun main(args: Array<String>) {
    val first = arrayOf(1,3,6,9,8,12,65,45,12,36)
    val second= arrayOf(-45,-12,-21,-10,-2,-46,-100)
    minAndMax(first)
    println("")
    minAndMax(second)
}

fun minAndMax(numbers: Array<Int>){
    checkMax(numbers)
    checkMin(numbers)
}
fun checkMax(numbers: Array<Int>){
    var max = numbers[0]
    for (i in numbers){
        if (i > max){
            max = i
        }
    }
    println("The biggest number is $max")
}
fun checkMin(numbers: Array<Int>){
    var min = numbers[0]
    for (i in numbers){
        if (i < min){
            min = i
        }
    }
    println("The smallest number is $min")
}