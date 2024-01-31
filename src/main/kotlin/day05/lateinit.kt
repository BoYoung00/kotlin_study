package day05

fun main() {
    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())
}

// lateinit : 아직 변수에 값을 할당하지 않았음을 표시
class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String { // 반환값 String
        if(::text.isInitialized) { // 변수에 값이 할당 됐는지 확인
            return text
        } else {
            return "기본값"
        }
    }
}