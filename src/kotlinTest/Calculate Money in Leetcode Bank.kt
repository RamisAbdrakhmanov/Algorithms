package kotlinTest

fun totalMoney(n: Int): Int {
    var rate: Int = n
    var sum = 0;

    while (rate > 0) {
        sum += rate/7  + rate%7
        rate--
    }

    return sum
}