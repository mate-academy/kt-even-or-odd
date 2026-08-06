package mate.academy

// Create a function `evenOrOdd` that takes an integer as an argument
// and returns "Even" for even numbers or "Odd" for odd numbers.
fun evenOrOdd(number: Int): String {
    return when (number % 2 == 0) {
        true -> "Even"
        false -> "Odd"
    }
}
