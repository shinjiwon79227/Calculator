package com.sjw.calculator

class Calculator3 {
    fun calculate(abstractOperation: AbstractOperation): Int {
        return abstractOperation.calculate()
    }
}