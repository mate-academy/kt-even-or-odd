package mate.academy

const val NUMBER_EVEN = 2
const val ZERO = 0
// Create a function `evenOrOdd` that takes an integer as an argument
// and returns "Even" for even numbers or "Odd" for odd numbers.

fun evenOrOdd(number: Int): String = if (number % NUMBER_EVEN == ZERO) "Even" else "Odd"