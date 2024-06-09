package com.sjw.calculator

import java.util.Scanner

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
            1 -> result = AddOperation().calculate(numArr.get(0), numArr.get(1))
            2 -> result = SubstractOperation().calculate(numArr.get(0), numArr.get(1))
            3 -> result = MultiplyOperation().calculate(numArr.get(0), numArr.get(1))
            4 -> result = DivideOperation().calculate(numArr.get(0), numArr.get(1))
            -1 -> flag = false // -1이면 flag를 false로 바꿔 while문을 종료시킴
            else -> println("$inputBtn 은 없는 버튼입니다. 다시 입력해주세요.") // 그 외 다른 숫쟈를 입력한 경우
        }
        if (flag) println("계산 결과 : $result") // -1을 눌러 종료 시킬 때 결과 출력을 하지 않고 종료
    }
}