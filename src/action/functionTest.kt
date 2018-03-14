package action

fun main(args: Array<String>) {
    val set = hashSetOf(1, 2, 3)
    val list = arrayListOf(1, 2, 3)
    val map = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    for ((number, name) in map) {
        println(list.joinToString(separator = "; ", prefix = "(", postFix = ")"))
    }
    println(map.toString())
}

fun String.lastChar(): Char = this.get(this.length - 1)

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postFix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postFix)
    return result.toString()
}