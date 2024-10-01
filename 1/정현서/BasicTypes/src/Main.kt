fun main() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456
    val socialSecurityNumber = 1234_5678_9012_3456
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    val a: Int = 100
    val b: Int? = 100
    println("${a === b}")
    println("${a == b}")
    print(a === a)

    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA === anotherBoxedA)

    val c: Int = 1
    val d: Long = a.toLong()

    var array: Array<String> = arrayOf("one", "two", "three", "four")
    println(array.get(0))
    println(array[0])
    println(array.size)

    val e = Array(5, { i -> i.toString() })
    val f = arrayOf(1, 2, 3)

    var x: String = "Kotlin"
    println(x.get(0))
    println(x[0])
    println(x.length)

    val s = "Hello, World!\n"
    println(s)
    val g = """
        우와 쩐다
        코틀린 최고야!
        우와!!
    """
    print(g)
}
