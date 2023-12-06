package kotlin

class `Find Words Containing Character` {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val list  = mutableListOf<Int>()
        for (index in words.indices){
            if(words[index].contains(x)) {
                list += index
            }
        }
        return list
    }
}