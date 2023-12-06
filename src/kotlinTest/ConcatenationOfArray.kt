package kotlinTest

class ConcatenationOfArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(2*nums.size)
        for (index in nums.indices){
            ans[index] = nums[index];
            ans[index+nums.size] = nums[index]
        }
        return ans
    }

}