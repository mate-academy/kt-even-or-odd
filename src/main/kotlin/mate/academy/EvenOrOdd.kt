package mate.academy

// Create a function `evenOrOdd` that takes an integer as an argument
// and returns "Even" for even numbers or "Odd" for odd numbers.
fun evenOrOdd (num: Int): String{
    if (num % 2 == 0){
        return "Even"
    } else {
        return "Odd"
    }
}
