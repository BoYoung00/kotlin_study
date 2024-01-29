package day03

fun main() {
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()


    println(Counter.count)
}

// 객체 선언 없이 모든 변수의 값과 함수를 같이 사용할 수 있는거
object Counter {
    var count = 0

    fun countUp() {
        count++
    }
    fun clear() {
        count = 0
    }
}