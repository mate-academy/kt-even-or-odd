package mate.academy

private const val EVEN = "Even"
private const val ODD = "Odd"

fun evenOrOdd(number: Int): String = if(number % 2 == 0) EVEN else ODD
