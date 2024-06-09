package com.sjw.calculator

import java.util.Scanner

/*class Calculator {
    lv1
    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun times(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun mod(num1: Int, num2: Int): Int {
        return num1 % num2
    }

}*/

fun main() {
    var flag = true // while문의 흐름제어
    val string1 = "계산할 숫자를 입력하세요. (,로 구분)"
    val string2 = """계산기
            |1. +
            |2. -
            |3. *
            |4. /
            |5. %
            |-1. 끝내기
        """.trimMargin()
    val input = Scanner(System.`in`) // 사용자에게 입력을 받기 위해 scanner 객체 담음
    var inputNum = "" // 사용자가 입력한 연산할 숫자를 담을 변수 -> 숫자가 두 개 이기 때문에 String으로 받음
    var inputBtn = 0 // 사용자가 입력한 버튼의 숫자를 담을 변수
    val numArr = mutableListOf<Int>() // inputNum을 자른 것을 담을 변수
    var result = 0 // 연산한 결과를 담을 변수


    while (flag) {
        println(string1)
        inputNum = input.next() // 사용자에게 연산할 숫자를 입력받음
        numArr.clear() // 연속으로 계산할 경우 전에 담긴 숫자들이 있기 때문에 초기화 해줘야함
        inputNum.split(",").forEach { it -> numArr.add(it.toInt()) } // 사용자에게 입력받은 숫자를 split 후 numArr에 int로 변환 후 담아줌

        println(string2)
        inputBtn = input.nextInt() // 사용자에게 버튼의 숫자를 입력받음
        when(inputBtn){ // 버튼이

            /*1 -> result = Calculator().plus(numArr.get(0), numArr.get(1)) // 1이면 더한 후 result에 담아줌
            2 -> result = Calculator().minus(numArr.get(0), numArr.get(1)) // 2이면 빼준 후 result에 담아줌
            3 -> result = Calculator().times(numArr.get(0), numArr.get(1)) // 3이면 곱한 후 result에 담아줌
            4 -> result = Calculator().divide(numArr.get(0), numArr.get(1)) // 4이면 나눈 후 result에 담아줌
            5 -> result = Calculator().mod(numArr.get(0), numArr.get(1)) // 5이면 나머지 연산 후 result에 담아줌*/
        }
        if (flag) println("계산 결과 : $result") // -1을 눌러 종료 시킬 때 결과 출력을 하지 않고 종료
    }
}