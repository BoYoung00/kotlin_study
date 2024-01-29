package day02

fun main() {
    var a = Animal("박철식", 5, "병아리")
    var b = Dog("용석만", 3)
    var c = Cat("곽묵팔", 2)

    a.introduce()
    b.introduce()

    b.bark()

    c.introduce()
    c.meow()
}

// 슈퍼 클래스
// open : 클래스 상속을 허용
open class Animal(var name:String, var age:Int, var type:String) {
    fun introduce() {
        println("${type}, ${name}(${age})")
    }
}

// 서브 클래스
// 슈퍼 클래스의 생성자를 그대로 받으려면 val, var을 빼야 함
class Dog (name:String, age:Int) : Animal(name, age, "수달") {
    fun bark() {
        println("앵앵")
    }
}

class Cat (name:String, age:Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}