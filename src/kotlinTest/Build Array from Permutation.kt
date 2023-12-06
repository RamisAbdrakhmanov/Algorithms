package kotlinTest

class `Build Array from Permutation` {
    fun buildArray(nums: IntArray): IntArray {
        return nums.map { i -> nums[i] }.toIntArray()
    }
}