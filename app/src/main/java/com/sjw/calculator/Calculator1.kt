package com.sjw.calculator

open class Calculator1 {
    open fun calculate(num1: Int, num2: Int): Int {
        println("연산")
        return num1 % num2
    }
}