package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvenOrOddTest {

    @Test
    fun evenOrOdd_NumberIsEven_ReturnsEven() {
        // given
        val number = 2

        // when
        val result = evenOrOdd(number)

        // then
        assertEquals("Even", result)
    }

    @Test
    fun evenOrOdd_NumberIsOdd_ReturnsOdd() {
        // given
        val number = 3

        // when
        val result = evenOrOdd(number)

        // then
        assertEquals("Odd", result)
    }

    @Test
    fun evenOrOdd_NegativeEvenNumber_ReturnsEven() {
        // given
        val number = -4

        // when
        val result = evenOrOdd(number)

        // then
        assertEquals("Even", result)
    }

    @Test
    fun evenOrOdd_NegativeOddNumber_ReturnsOdd() {
        // given
        val number = -5

        // when
        val result = evenOrOdd(number)

        // then
        assertEquals("Odd", result)
    }
}
