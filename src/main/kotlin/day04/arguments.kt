package day04

fun main() {
    // default arguments
    deLiveryItem("가방", destination = "학교")

    // variable number of arguments
    sum(1,2,3,4)

    // infix function
    println(6 multiply 4) // 왼쪽 this, 오른쪽 파라미터
}

// 기본 파라미터 값 지정
fun deLiveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name} ${count}개를 ${destination}에 배달하였습니다.")
}

// 1개 이상의 파라미터를 받으려고 할 때
fun sum(vararg numbers: Int) { // vararg은 꼭 마지막 파라미터에 사용
    var sum = 0

    for (n in numbers) {
        sum += n
    }
    println(sum)
}

// 연산자처럼 사용 가능
// 클래스 안에서 사용할 때 this는 생략(Int.)
infix fun Int.multiply(x: Int): Int = this * x