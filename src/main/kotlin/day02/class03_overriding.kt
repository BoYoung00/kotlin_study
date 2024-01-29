package day02

fun main() {
    var a = Rabbit()

    a.eat()
}

abstract class Anima1() {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Anima1() {
    override fun eat() {
        println("당근을 먹습니다.")
    }
}