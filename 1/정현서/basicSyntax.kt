package fun main(a: Int, b: Int) {
    
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int) = a + b

fun printKotlin(): Unit {
    println("hello Kotlin")
}

fun printKotlin() {
    println("hello Kotlin")
}

val a: Int = 1 // 즉시 할당
val b = 2 // `Int` type 추론
val c: Int // 컴파일 오류, 초기화가 필요함
c = 3 // 컴파일 오류, 읽기전용

var x = 5
x += 1

// 주석

/*wntjrwjtnw
asdfasd
fasdfasdf
주석임 */

var a = 1
val s1 = "a is $a"

a = 2
val s2 = "$${s1.replace("is", "was")}, but now is $a"

fun maxOf(a: Int, b:Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    // 정수가 아닌 경우 null을 리턴
}

fun printProduct(arg1: String, arg2: String) {
    val x: Int? parseInt(arg1)
    val y: Int? parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    return null
}

val items = listOf("apple", "banana", "kiwi")
var index = 0
while (index < items.size) {
    println("item at $index is $${items[index]}")
    index++
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

val x = 3
if (x in 1..10) {
    println("fits in range")
}

for (x in 1..5) {
    print(x)
}

val items listOf("apple", "banana", "kiwi")
for (item in items) {
    println(item)
}

val items = setOf("apple", "banana", "kiwi")
when {
    "orange" in items -> println("juicy")
    "apple" in items -> println("aplle is fine too")
}

val fruits = listOf("banana", "avocado", "apple", "kiwi")
fruits
    .filter { it.startsWith("a") }
    .sortedBy { it }
    .map { it.uppercase() }
    .forEach { println(it) }

