package day01

fun main() {
    var a = Person("김보영", 2000)
    var b = Person("이두호")

//    println("${a.name}, ${a.birthYear}")

    a.print()
    b.print()
}

class Person (var name:String, val birthYear:Int) {
    fun print() {
        println("${name}, ${birthYear}")
    }

    init { // 생성자 초기화
        println("init")
    }

    // 보조 생성자 (생성자 오버라이드 비슷)
    constructor(name:String) : this(name, 1998) {
        println("보조 생성자")
    }
}