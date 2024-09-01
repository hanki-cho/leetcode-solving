package easy

/**
 * https://leetcode.com/problems/convert-1d-array-into-2d-array/description/?envType=daily-question&envId=2024-09-01
 */
class Solution_2022 {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {

        if(m * n != original.size)
            return emptyArray()

        val result = mutableListOf<IntArray>()

        for(row in 0..< m) {
            val from = row * n
            val to = ((row + 1) * n)

            result.add(original.copyOfRange(from, to))
        }

        return result.toTypedArray()
    }
}