package com.bigbang.testingapplication.util

class CalculatorKt {

//    fun addNumbers(numA: Int, numB: Int) :Int = numA + numB // Method below can also be rewritten as <-
    fun addNumbers(numA: Int, numB: Int) :Int{
        return (numA + numB)
    }

    fun subtractNumbers(numA: Int, numB: Int) :Int{
        return (numA - numB)
    }

    fun divideNumbers(numerator: Int, denominator: Int) :Int{
        return (numerator/denominator)
    }

    fun multiply(numA: Int, numB: Int) :Int{
        return (numA * numB)
    }


    fun squareNumber(numA: Int) :Int{
        return numA.square()
    }

    fun cubeNumber(numA: Int) :Int{
        return numA.cube()
    }

    private fun Int.square(): Int {
        return (this * this)
    }

    private fun Int.cube(): Int {
        return (this * this * this)
    }




}