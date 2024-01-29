package day02


fun main() {
    // 고차 함수 형태
    b(::a)

    // 람다식 함수
    val c: (String) -> Unit = { str -> println("$str 람다함수") }
    b(c)
}

fun a(str:String) {
    println("$str 함수 a")
}

// Unit : 값이 없음 (반환이 없다)
fun b(function: (String) -> Unit) {
    function("b가 호출함")
}