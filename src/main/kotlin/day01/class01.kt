package day01

fun main() {
    var a = Person("김보영", 2000)

//    println("${a.name}, ${a.birthYear}")

    a.print()
}

class Person (var name:String, val birthYear:Int) {
    fun print() {
        println("${name}, ${birthYear}")
    }
}