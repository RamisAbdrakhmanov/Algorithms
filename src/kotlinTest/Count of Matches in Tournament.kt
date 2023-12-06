package kotlinTest

class `Count of Matches in Tournament` {
    fun numberOfMatches(n: Int): Int {
        var temp = n
        var sum = 0
        while (temp > 1) {
            if (temp % 2 == 0) {
                temp /= 2
                sum += temp
            } else{
                temp /= 2
                sum += temp++
            }
        }
        return sum
    }
}