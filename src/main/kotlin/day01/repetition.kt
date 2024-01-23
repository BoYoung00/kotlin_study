package day01

fun main() {
    var a = 0

    while(a < 5) {
        println(a++)
    }

    do {

    }while (true)

    for (i in 0..9) {
    }

    for (i in 0..9 step 3) {
    }

    for (i in 0 downTo 9) {
    }

    for (i in 'a' .. 'e') {
    }

    loop@for (i in 0..9) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("$i, $j")
        }
    }
}