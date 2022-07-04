package com.yeoul.kotlin_example_01

class User(var name: String) {
    private var type: String = ""
    private var age: Int = 0

    constructor(name: String, type: String, age: Int) : this(name) {
        this.type = type
        this.age = age
    }

    fun printStatus() {
        println("name: $name, mbti: $type")
    }
}

fun main(args: Array<String>) {
    val user = User("ㅇㅅㅇ", "ISBF", 30)
    user.printStatus()
}