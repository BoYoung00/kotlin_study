package day04

fun main() {
    val test1 = "Test.Kotlin.String"

    println(test1.length)

    println(test1.toLowerCase())
    println(test1.toUpperCase())

    val test2 = test1.split(".")
    println(test2)

    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))

    // 아래부터는 bool 타입
    println("-----------")
    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    // 비어있는 것만 허용
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    // 비어있는 것만 허용 (공백 문자 허용)
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    println("-----------")
    var test3 = "Kotlin.kt"
    var test4 = "java.java"

    // java로 시작하는지
    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    // .kt로 끝나는지
    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    // lin을 포함하는지
    println(test3.contains("lin"))
    println(test4.contains("lin"))
}