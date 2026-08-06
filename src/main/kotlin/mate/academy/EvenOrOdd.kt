package mate.academy
private const val DIVISOR_FOR_PARITY = 2
private const val EVEN_REMAINDER = 0
private const val EVEN_REMA = 10
fun evenOrOdd(number: Int) = if (number % DIVISOR_FOR_PARITY  == EVEN_REMAINDER) {
    "Even"
} else {
    "Odd"
}

fun main() {
    println("10 e ${evenOrOdd(EVEN_REMA)}")
}
