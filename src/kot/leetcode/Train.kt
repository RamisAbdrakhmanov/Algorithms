package kot.leetcode

import java.util.LinkedList
import kotlin.math.abs

fun main() {
    digitize(123)
}

fun digitize(n:Long) {
    var str = n.toString()
    println("${str.length}  длинна строки")
    var arr = str.split("")
    println("${arr.size}  длинна массива")
}