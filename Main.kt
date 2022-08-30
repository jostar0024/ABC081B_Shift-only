fun divCount(x: Int): Int {
  var count = 0
  var currentX = x
  while (currentX % 2 == 0) {
    count++
    currentX /= 2
  }
  return count
}

fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  val xs = readLine()!!.split(" ").map(String::toInt)
  val ans = xs.map(::divCount).minOrNull()
  println(ans)
}