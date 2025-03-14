package mate.academy

const val EVEN_NUMBER = "Even"
const val ODD_NUMBER = "Odd"

fun evenOrOdd(number: Int): String = if(number % 2 == 0) EVEN_NUMBER else ODD_NUMBER
