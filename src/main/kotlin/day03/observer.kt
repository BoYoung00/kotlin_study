package day03

fun main() {
    EventPrinter().start()
}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter1(var listener: EventListener) {
    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

// 익명객체
class EventPrinter {
    fun start() {
        val counter = Counter1(object : EventListener {
            override fun onEvent(count: Int) {
                print("${count} - ")
            }
        })
        counter.count()
    }
}

//class EventPrinter: EventListener {
//    override fun onEvent(count: Int) {
//        print("${count} - ")
//    }
//
//    fun start() {
//        val counter = Counter1(this)
//        counter.count()
//    }
//
//}