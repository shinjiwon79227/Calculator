package com.sjw.calculator

class AddOperation(val num1: Int, val num2: Int): AbstractOperation()/*Calculator1()*/{
    override fun calculate(): Int {
        return num1 + num2
    }
}