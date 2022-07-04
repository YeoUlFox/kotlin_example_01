package com.yeoul.kotlin_example_01

sealed class Expr

data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when(expr) {
    is Const -> {
        expr.number
    }
    is Sum -> {
        eval(expr.e1) + eval(expr.e2)
    }
    
    // Object class는 is 키워드 없이 조건문에서 필터링됨
    NotANumber -> {
        Double.NaN
    }
}

fun main() {
    val num1 = Const(10.0)
    val num2 = Const(20.0)
    val sum = Sum(num1, num2)
    val result = eval(sum)
    println(result)
}