package mate.academy

// Create a function `evenOrOdd` that takes an integer as an argument
// and returns "Even" for even numbers or "Odd" for odd numbers.
const val EVEN_NUMBER = "Even"
const val ODD_NUMBER = "Odd"

fun evenOrOdd(number: Int): String {
    return if (number % 2 == 0) EVEN_NUMBER else ODD_NUMBER
}
