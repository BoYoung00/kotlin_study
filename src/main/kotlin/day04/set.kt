package day04

// Set : 트리 구조(정렬X), 인덱스를 참조해서 값 반환 X
fun main() {
    val a = mutableSetOf("귤", "바나나", "키위")
    
    for(item in a)
        println("${item}")
    
    a.add("자몽")
    println(a)
    
    a.remove("바나나")
    println(a)
    
    println(a.contains("귤"))
}