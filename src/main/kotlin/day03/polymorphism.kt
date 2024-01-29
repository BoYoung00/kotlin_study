package day03

fun main() {
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    // is : 조건문 안에서만 잠시 다운 캐스팅 됨
    if(b is Cola) {
        b.washDishes()
    }

    // as : 반환값, 변수 자체도 다운 캐스팅 됨
    var c = b as Cola
    c.washDishes()
    b.washDishes()
}

open class Drink {
    var name = "음료"
    open fun drink() {
        println("${name}를 마십니다")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중에 ${type}를 마십니다.")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다.")
    }
}