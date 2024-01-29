package day02

fun main() {

    // apply : 객체 생성 후 초기화
    var a = Book("코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    // run : 객체에 대한 작업 수행 및 결과 출력
    a.run {
        println("상품명 : ${name}, 가격 : ${price}")
    }

    // with : run과 같음
    with(a) { }

    // 같은 이름의 변수나 함수가 스코프 바깥에 중복 되어 있을 경우 (it을 사용하기 위해)
    var price = 5000

    // apply와 같은 기능
    var b = Book("코틀린", 10000).also {
        it.name = "[초특가]" + it.name
        it.discount()
    }

    // run과 같은 기능
    b.let {
        println("상품명 : ${it.name}, 가격 : ${it.price}")
    }
}

class Book(var name: String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}