package mate.academy

const val EVEN = "Even"
const val ODD = "Odd"

fun evenOrOdd(num : Int) : String = if (num % 2 == 0) EVEN else ODD
