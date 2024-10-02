fun main() {
    val a = 5
    val b = 2

    var max = if (a < b) a else b
    // 삼항연산자 없음

    var max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }

    println(max)


    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
    // break 안써도됨

    var res = when (x) {
        100 -> "A"
        90 -> "B"
        80 -> "C"
        else -> "F"
    }

    var res when(x) {
        true -> "맞다"
        false -> "틀리다"
    }

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("x is neither 1 nor 2")
    }

    when (x) {
        parseInt(x) -> print("x == parseInt")
        1 + 3 -> print("x == 1 + 3")
        else -> print("s does not encode x")
    }

    val vaildNumbers = listOf(3, 6, 9)
    when (x) {
        in vaildNumbers -> print("x == vaildNumbers")
        in 1..10 -> print("x is no 1 and 10")
        !in 10..20 -> print("x is no 10 and 20")
        else -> print("none of the above")
    }

    when {
        x.isOdd()  -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("none of the above")
    }
    // 인자를 입력하지 않으면 논리연산으로 처리됨

    for (item in collection)
        print(item)

    for (item in collection) {
        print(item.id)
        print(item.name)
    }

    val array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        print("$i: ${array[i]}")
    }
    // 배열이나 리스트를 반복할 때, index를 이용하고 싶다면 indices를 이용하면 됨

    val array = arrayOf("a", "b", "c")
    for ((index, value) in array.withIndex()) {
        println("$index: $value")
    }
    // Index를 이용하고 싶으면 withIndex()를 쓸수도 있음

    while (x > 0) {
        x--
    }

    do {
        val y = retrieveData()
    } while (y != null)
    // 바디의 지역변수를 do-while에서 참조할 수 있음
}

fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}
// 스마트 캐스트가 적용됨 is를 사용해도