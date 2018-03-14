package action

import geekymax.Color
import geekymax.Color.*
import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        print("$letter = $binary ")
    }

    val list = arrayListOf("hello", "a", "because")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

class Student(val age: Int, val name: String, val sex: Boolean) {
    val isGood: Boolean
        get() {
            return false
        }
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'


fun getMnemonic(color: Color) = when (color) {
    YELLOW -> "yellow"
    BLUE -> "blue"
    RED -> "red"
    GREEN -> "green"
    INDIGO -> "indigo"
    ORANGE -> "orange"
    VIOLET -> "violet"
}

fun mix(a: Color, b: Color) = when (setOf(a, b)) {
    setOf(RED, BLUE) -> INDIGO
    setOf(RED, GREEN) -> YELLOW
    else -> throw Exception("Dirty color")
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int =
        if (expr is Num) {
            expr.value
        } else if (expr is Sum) {
            eval(expr.right) + eval(expr.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

fun eval2(e: Expr): Int = when (e) {
    is Num ->
        e.value
    is Sum ->
        eval2(e.left) + eval2(e.right)
    else ->
        throw IllegalArgumentException("Unknown expression")
}

fun recognize(c: Char) = when (c) {
    in 'a'..'z' -> "lower"
    in 'A'..'Z' -> "upper"
    in '0'..'9' -> "digit"
    else -> "unknown"
}

class MyClass(val a: Int, val b: Int) : Comparable<MyClass> {
    override fun compareTo(other: MyClass): Int = (100 * a + b) - (other.a * 100 + other.b)
}