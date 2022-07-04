package com.yeoul.kotlin_example_01

sealed class Color  {
    object Red: Color()
    object Blue: Color()
    object Yellow: Color()
}

fun main() {
    /* VS Sealed Class
    둘다 타입을 제한 할때 사용
    enum은 하나의 타입만
    Sealed Class는 여러가지의 객체를 생성할 수 있음 */

    val color: Color = Color.Red

    val font =  when (color) {
        is Color.Red -> "빠란색 폰트"
        is Color.Blue -> "Open Sans"
        is Color.Yellow -> "sans-serif"
        else -> {}
    }
    println(font)
}
