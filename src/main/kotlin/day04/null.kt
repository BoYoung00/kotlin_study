package day04

fun main() {
    var a: String? = null

    // null이라면 뒤에있는 구문 실행 X
    println(a?.toUpperCase())

    // null이라면 defaiult로 대체
    println(a?:"default".toUpperCase())

    // 런타임시 오류제어
    println(a!!.toUpperCase())

    // 스코프 사용
    a?.run {
        println(toUpperCase())
        println(toLowerCase())
    }
}