package day04

// map : key, value
fun main() {
    val a = mutableMapOf("아이스크림" to 1000,
                        "과자" to 900,
                        "음료수" to 800)

    for(food in a)
        println("${food.key} : ${food.value}")

    a.put("껌", 300)
    println(a)

    a.remove("과자")
    println(a)

    println(a["음료수"])
}