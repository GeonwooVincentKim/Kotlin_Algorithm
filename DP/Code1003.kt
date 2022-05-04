var dp = Array(41) { IntArray(2) }

fun main() = with(System.`in`.bufferedReader()) {
    dp[0][0] = 1
    dp[1][1] = 1

    repeat(readLine().toInt()) {
        val case = readLine().toInt()
        for (i in 2 until case + 1) {
            for (j in 0 until 2) {
                dp[i][j] = dp[i - 1][j] + dp[i - 2][j]
            }
        }
        println(dp[case].joinToString(" "))
    }
}
