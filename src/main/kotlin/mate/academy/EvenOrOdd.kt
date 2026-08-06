package mate.academy

// Create a function `evenOrOdd` that takes an integer as an argument
// and returns "Even" for even numbers or "Odd" for odd numbers.
const val TWO = 2
const val ZERO = 0
 fun evenOrOdd(number: Int): String {
   return if (number % TWO == ZERO) "Even" else "Odd"
}
