package mate.academy

// Create a function `evenOrOdd` that takes an integer as an argument
// and returns "Even" for even numbers or "Odd" for odd numbers.

fun evenOrOdd(number: Int) = when {
    number % TWO == ZERO -> "Even"
    else -> "Odd"
}

const val ZERO = 0
const val TWO = 2
