package com.yeoul.kotlin_example_01

abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    // abstract property : 반드시 하위 클래스에서 재정의해서 초기화
    abstract var maxSpeed: Double

    // 그냥 property
    var year = "2022"

    abstract fun start()
    abstract fun stop()

    // 그냥 function
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, MaxSpeed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("자동차 시작")
    }

    override fun stop() {
        println("자동차 정지")
    }
}

class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("오토바이? 시작")
    }

    override fun stop() {
        println("오토바이? 정지")
    }
}

fun main() {
    val car = Car("자동차", "누런색", 10000.0, 200.0)
    val motor = Motorcycle("오또바이", "black", 10002.0, 130.0)
    car.year = "2024"
    car.displaySpecs()
    car.start()

    motor.displaySpecs()
    motor.start()
    motor.stop()
}