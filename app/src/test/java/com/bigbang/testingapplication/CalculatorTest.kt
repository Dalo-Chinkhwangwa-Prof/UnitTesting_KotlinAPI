package com.bigbang.testingapplication

import com.bigbang.testingapplication.util.CalculatorKt
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {

    private var calculator: CalculatorKt? = null

    @Before
    fun setUp() {
        calculator = CalculatorKt()
    }

    @Test
    fun testForAddition() {

        assertEquals(2, calculator?.addNumbers(1, 1))
        assertEquals(0, calculator?.addNumbers(0, 0))
        assertEquals(54, calculator?.addNumbers(49, 5))
        assertEquals(1048, calculator?.addNumbers(1023, 25))
        assertNotEquals(179, calculator?.addNumbers(1059, 20))

    }

    @Test
    fun testForSubtraction() {

        assertEquals(50, calculator?.subtractNumbers(100,50))
        assertEquals(3, calculator?.subtractNumbers(9,6))
        assertNotEquals(56, calculator?.subtractNumbers(234,4))
        assertEquals(-2, calculator?.subtractNumbers(-1,1))
        assertEquals(10,calculator?.subtractNumbers(15, 5))

    }

    @Test
    fun testForDivision() {

        assertEquals(3,calculator?.divideNumbers(10,3))
        assertEquals(53, calculator?.divideNumbers(106, 2))
        assertEquals(50, calculator?.divideNumbers(100,2))
    }

    @Test
    fun testForMultiplication() {

        assertEquals(100,calculator?.multiply(10,10))
        assertNotEquals(29, calculator?.multiply(3, 9))
        assertEquals(100, calculator?.multiply(25,4))

    }

    @Test
    fun testForSquare() {

        assertEquals(100,calculator?.squareNumber(10))
        assertEquals(225, calculator?.squareNumber(15))
        assertEquals(64, calculator?.squareNumber(8))
        assertNotEquals(23, calculator?.squareNumber(5))
        assertEquals(16, calculator?.squareNumber(4))

    }

    @Test
    fun testForCube() {

        assertEquals(1000,calculator?.cubeNumber( 10))
        assertEquals(4096, calculator?.cubeNumber(16))
        assertEquals(27, calculator?.cubeNumber(3))
        assertNotEquals(10, calculator?.cubeNumber(2))
        assertEquals(343,calculator?.cubeNumber(7))
        assertEquals(8, calculator?.cubeNumber(2))

    }


    @After
    fun tearDown() {
        calculator = null
    }
}