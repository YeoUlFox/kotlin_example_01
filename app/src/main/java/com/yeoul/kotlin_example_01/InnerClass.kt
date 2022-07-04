package com.yeoul.kotlin_example_01

/*
자바에서는 클래스 안에 클래스를 선언하면 자동으로 내부 클래스
코틀린에서는 X
따로 Inner클래스 명시를 해주지 않으면 중첩 클래스로, 내부에서 외부 클래스 참조 불가능
*/

// Nested Class
class Outer {
    private val bar: Int = 1

    class Nested {
        // 함수의 리턴형으로 = 2를 사용 (return 2)
        fun foo() = 2
        // fun foo() = bar // error
    }
}

// Inner Class
class OuterInner {
    private val bar: Int = 1

    inner class Inner {
        fun foo() = bar
        // OuterInner의 this에 접근
        fun foo2() = this@OuterInner.bar
    }
}

fun main() {
    // Nested 객체를 생성 후 메소드 호출
    val outerNested = Outer.Nested().foo()
    // 내부 클래스를 객체로 만들려면 외부 클래스부터 객체를 생성 후 이후에 내부 객체 생성
    val outerInner = OuterInner().Inner().foo()

    println(outerNested)
    println(outerInner)
    
}