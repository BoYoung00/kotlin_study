package day05

fun main() {
    // 초기화 늦추기
    val number: Int by lazy {
        println("초기화 합니다")
        7
    }

    println("코드를 출력합니다")
    println(number) // 여기서 number가 7로 초기화된다.
    println(number)
}