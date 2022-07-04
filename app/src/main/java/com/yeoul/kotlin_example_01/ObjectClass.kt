package com.yeoul.kotlin_example_01

// for Singleton or anonymous class
object Cat {
    var name: String = ""
    var type: String = ""
    var age: Int = 0

    fun printStatus() {
        println("Cat(name='$name', type='$type', age=$age)");
    }
}

fun main() {
    // 객체를 생성하지 않고 바로 접근
    Cat.name = "ㅇㅅㅇㅅㅇ"
    Cat.age = 3
    Cat.printStatus()
}