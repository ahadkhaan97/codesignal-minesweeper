fun main() {
    solution(
        mutableListOf(
            mutableListOf(true, false, false),
            mutableListOf(false, true, false),
            mutableListOf(false, false, false),
        )
    )
}

fun solution(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {
    val tempList = mutableListOf<MutableList<Int>>()
    for (i in 0 until matrix.size) {
        val tempInnerList = mutableListOf<Int>()
        for (j in 0 until matrix[0].size) {
            tempInnerList.add(0)
        }
        tempList.add(tempInnerList)
    }

    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[0].size) {
            if (i > 0 && j > 0) {
                if (matrix[i - 1][j - 1]) {
                    tempList[i][j]++
                }
            }
            if (i > 0) {
                if (matrix[i - 1][j]) {
                    tempList[i][j]++
                }
            }
            if (j > 0) {
                if (matrix[i][j - 1]) {
                    tempList[i][j]++
                }
            }
            if (i < matrix.size - 1) {
                if (matrix[i + 1][j]) {
                    tempList[i][j]++
                }
            }
            if (j < matrix[0].size - 1) {
                if (matrix[i][j + 1]) {
                    tempList[i][j]++
                }
            }
            if (i < matrix.size - 1 && j < matrix[0].size - 1) {
                if (matrix[i + 1][j + 1]) {
                    tempList[i][j]++
                }
            }
            if (i < matrix.size - 1 && j > 0) {
                if (matrix[i + 1][j - 1]) {
                    tempList[i][j]++
                }
            }
            if (i > 0 && j < matrix[0].size - 1) {
                if (matrix[i - 1][j + 1]) {
                    tempList[i][j]++
                }
            }
        }
    }

    return tempList
}