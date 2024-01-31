package day05

import kotlinx.coroutines.*

fun main() {
    // 코루틴을 사용하는 코드를 블록으로 감싸주는 용, 메인에서도 사용 가능하게 해줌
//    runBlocking {
//        // 백그라운드에서 코루틴 시작
//        val a = launch {
//            for(i in 1..5) {
//                println(i)
//                delay(10)
//            }
//        }
//
//        // 새로운 코루티 시작하고 결과 반환
//        val b = async {
//            "async 종료"
//        }
//
//        // async의 결과 기다림
//        println("async 대기")
//        println(b.await())
//
//        // launch의 작업이 끝날 때까지 대기
//        println("launch 대기")
//        a.join()
//        println("launch 종료")
//    }

}