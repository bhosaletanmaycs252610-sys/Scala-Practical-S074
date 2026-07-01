object Practical2 {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 3, 3, 6, 7, 8, 9, 3, 6, 5)

    // 1. Calculate Mean
    val mean = numbers.sum.toDouble / numbers.length

    // 2. Calculate Median
    val sorted = numbers.sorted
    val len = sorted.length
    val median = if (len % 2 == 1) {
      sorted(len / 2).toDouble
    } else {
      (sorted(len / 2 - 1) + sorted(len / 2)).toDouble / 2
    }

    // 3. Calculate Mode
    val counts = numbers.groupBy(identity).map(t => (t._1, t._2.size))
    val maxCount = counts.values.max
    val mode = counts.filter(_._2 == maxCount).keys.toList

    // Print the results
    println(s"Dataset: $numbers")
    println(s"Mean: $mean")
    println(s"Median: $median")
    println(s"Mode: $mode")
  }
}