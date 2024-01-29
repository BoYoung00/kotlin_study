package day02

fun main() {
    var d = Dog1()

    d.run()
    d.eat()
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹다")
    }
}

class Dog1 : Runner, Eater {
    override fun run() {
        println("우다다다")
    }
    override fun eat() {
        println("허겁지겁")
    }
}