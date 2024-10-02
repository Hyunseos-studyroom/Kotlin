package hi.pkg

fun Hello1() {
    println("Hello World!")
}

fun Hello2() {
    println("Hello World!2")
}

//import hi.pkg.*
import hi.pkg.Hello1

fun main(args: Array<String>) {
    Hello1()
    Hello2()
}


import foo.Bar

import foo.*

import bar.Bar as bBar

fun sum(a: Int, b: Int): Int {
    println("a: $a, b: $b")
    return a + b
}

for (x in 1..10) {
    if (x > 2) {
        break
    }
    println("x: $x")
}


for (x in 1..10) {
    if (x > 2) {
        continue
    }
    println("x: $x")
}

loop@ for (i in 1..10) {
    println("---i: $i ---")

    for (j in 1..10) {
        println("j $j")
        if (i + j > 12) {
            break@loop
        }
    }
}
//이중 for문을 사용할 때 레이블을 사용해서 두 개의 for문을 연결할 수 있음

fun foo() {
    var ints = listOf(0, 1, 2, 3)


    ints.forEach(fun(value: Int) {
        if (value == 1) return
        print(value)
    })
    print("End")
}
// 함수가 중첩되어있늘때 return을 넣으면 함수를 건너뜀

fun foo2() {
    var ints = listOf(0, 1, 2, 3)
    ints.forEach label@{
        if (it == 1) return @label
        print(it)
    }
    print("End")
}
// 람다식에서 reutrn할려면 label을 사용해야한다.
// label을 안쓰면 아예 함수를 건너뜀

fun foo3() {
    var ints = listOf(0, 1, 2, 3)
    ints.forEach {
        if (it == 1) return@forEach
        print(it)
    }
    print("End")
}
// 암시적 label을 사용할 수 있음