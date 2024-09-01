package easy

class Solution_1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        nums.mapIndexed { index, value ->
            val diff = target - value

            map[diff]?.let { return intArrayOf(it, index) }
            map.put(value, index)
        }

        return IntArray(0)
    }
}