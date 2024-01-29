package day03

fun main() {
//    UsingGeneric(A()).doShouting()
//    UsingGeneric(B()).doShouting()
//    UsingGeneric(C()).doShouting()

    doShouting(B())
    doShouting(C())
}

fun <T : A> doShouting(t : T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다")
    }
}

class B : A() {
    override fun shout() {
        println("B가 소리칩니다")
    }
}

class C : A() {
    override fun shout() {
        println("C가 소리칩니다")
    }
}

// <T : A> : A클래스의 자식 클래스만 들어와야 한다
// (val t : T) : 제네릭 타입의 인스턴스를 가지는 프로퍼티
class UsingGeneric<T : A> (val t : T) {
    fun doShouting() {
        t.shout()
    }
}