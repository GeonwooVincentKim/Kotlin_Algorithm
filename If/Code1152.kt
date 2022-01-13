import java.io.*
import java.util.StringTokenizer

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val rs = StringTokenizer(br.readLine())
    println(rs.countTokens())
    br.close()

}