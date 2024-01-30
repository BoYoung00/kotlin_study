package day04

fun main() {
    val a = General("보영", 111)

    println(a == General("보영", 111))
    println(a.hashCode())
    println(a)

    val b = Data("두호", 222)

    println(b == Data("두호", 222))
    println(b.hashCode())
    println(b)

    println(b.copy())
    println(b.copy("돼지"))
    println(b.copy(id = 123))

    // 리스트
    println()
    val list = listOf(Data("보영", 111),
                        Data("두호", 222),
                        Data("돼지", 333)
    )
    for ((a, b) in list)
        println("${a}, ${b}")

    // enum
    println()
    var state = State.SING

    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)
}

class General(val name: String, val id: Int)

// 간단한 데이터 저장 관리에 특화 됨
// equals(), hashCode(), toString() 등의 메서드가 자동 생성
// 복사 생성자 사용 가능
// 구조 분해 선언 가능
data class Data(val name: String, val id: Int)

// enum 클래스
enum class State(val message: String) {
    SING("노래"),
    EAT("밥"),
    SLEEP("잠");

    fun isSleeping() = this == SLEEP

}