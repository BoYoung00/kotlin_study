package day01

fun main() {
    var a: Int = 123
    println(a)

    // ? : 널러브 형식. null을 허용한다
    var b: Int? = null

    // 형변환
    var a2: Long = a.toLong()

    // 배열
    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5)
    intArr[2] = 8

    // 타입추론
    var num1 = 1
    var num2 = 1.5
    var num3 = 1L

    // 함수
    println(add1(1,2,3))
    println(add2(1,2,3)) // 단일 표현식
    

}

// 함수(파라미터) : 반환형
fun add1(a: Int, b: Int, c: Int) : Int {
    return a + b + c
}

// 단일 표현식 함수
fun add2(a: Int, b: Int, c: Int) = a + b + c