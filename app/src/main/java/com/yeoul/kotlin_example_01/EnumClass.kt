package com.yeoul.kotlin_example_01

import kotlin.random.Random

enum class Dumps {
    DTD, ASDF, DDD
}

enum class UsersName(val name_: String) {
    DTD("ㅇㅅㅇ"), ASDF("ㅁㄴㅇㄹ")
}

enum class RSPGame(val msg: String) {
    R("rock"),
    S("가위"),
    P("종이")
}

fun main() {
    val dumpsEnum : Dumps = Dumps.ASDF
    // name은 그 키 값, ordinal은 index 값으로 property가 자동 생성됨
    println("${dumpsEnum.name} ... ${dumpsEnum.ordinal}")

    // 모든 값
    val userEnum: Array<UsersName> = UsersName.values()
    for (i in userEnum.indices) {
        println("${userEnum[i].ordinal} : ${userEnum[i]},  ${userEnum[i].name_} ")
    }
    
    val random = Random.nextInt(0, 3)
    val selected = RSPGame.values()[random]
    println("${selected.msg}를 냈다")
    
    // Enum을 사용시 조건문에서 안드로이드 스튜디오 내부에서 분석하여 자동완성을 지원함
    when(selected) {
        RSPGame.R -> println("바위는 이기지 못한다")
        RSPGame.S -> println("가위는 바위로 이긴다")
        RSPGame.P -> println("종이는 불태운다")
    }
}