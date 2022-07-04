package com.yeoul.kotlin_example_01

data class Data (
    // val 로 선언할 경우, 코틀린 내부에서 setter를 생성하지 않는다 == 수정 불가능
    val name : String,
    val type : String,
    var num : Int,
    var own : Boolean
)

fun main(args: Array<String>) {
    val user1 = User("ㅇㅅㅇ", "ASDF", 20)
    user1.printStatus()
    
    val user2 = Data("ㅇㅅㅇ", "ASDF", 11, true)
    println(user2)
}