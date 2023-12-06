package kotlin

class `Largest3-Same-DigitNumberInString` {
    fun largestGoodInteger(num: String): String {
        var max = 0;
        var res = "";
        for (i in 0..num.length-3) {
            if (num[i] == num[i + 1] && num[i] == num[i + 2]) {
                if (num[i].toInt() > max) {
                    max = num[i].toInt();
                    res = num.substring(i, i + 3);
                }
            }
        }
        return res;
    }
}