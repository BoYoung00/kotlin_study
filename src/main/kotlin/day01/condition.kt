package day01

import java.util.StringJoiner

fun main() {
    var a = 7
    if(a > 10) {
        println("a > 10 : true")
    } else {
        println("a > 10 : false")
    }
}

// Any : 어떤 자료형이든 허용
fun doWhen(a: Any) {
    when(a) {
        1 -> println("점수 1")
        "kim" -> println("kim")
        is Long -> println("Long 타입")
        !is String -> println("!String")
        else -> println("어떤 조건에도 만족하지 않음")
    }
}

fun doWhen2(a: Any) {
    var result = when(a) {
        1 -> 1
        "kim" -> "kim"
        is Long -> "Long 타입"
        !is String -> "!String"
        else -> "어떤 조건에도 만족하지 않음"
    }
}