package day05

fun main() {
    val nameList = listOf("김보영", "이두호", "이보영", "박두호", "김두호")

    nameList.forEach { print(it + " ") }
    println()

    println(nameList.filter { it.startsWith("김") })

    println(nameList.map { "이름 : " + it })

    println(nameList.any { it == "김보영"})
    println(nameList.all { it.length == 3 })
    println(nameList.none{ it.startsWith("신")})

    println(nameList.first{ it.startsWith("김")})
    println(nameList.last{ it.startsWith("김")})
    println(nameList.count{ it.contains("보")})

    println()
    data class Person(val name: String, val birthYear: Int)

    val personList = listOf(Person("보영", 2000),
                            Person("두호", 1998),
                            Person("카리나", 2000),
                            Person("윈터", 2001))
    // birthYear를 키로 하는 Map 생성
    println(personList.associateBy { it.birthYear })
    // name을 키로 하는 Map 생성
    println(personList.groupBy { it.name })

    // 조건에 따라 리스트를 두 그룹으로 나눔
    val (over99, under99) = personList.partition { it.birthYear > 1999 }
    println(over99)
    println(under99)

    println()
    val number = listOf(-3, 7, 2, -10, 1)

    // flatMap : 람다 함수를 요소에 적용하고, 결과를 하나의 리스트 반환
    println(number.flatMap { listOf(it * 10, it + 10) })

    // 인덱스가 존재하지 않다면 50 반환
    println(number.getOrElse(1) {50})
    println(number.getOrElse(6) {50})

    // zip 리스트 합쳐서 map 만듦
    val names = listOf("A", "B", "C", "D")
    println(names zip number)
}