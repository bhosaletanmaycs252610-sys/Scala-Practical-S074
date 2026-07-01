import scala.util.Random

object Practical3 {
  def main(args: Array[String]): Unit = {
    // 1. Generate a random dataset of 10 numbers between 1.0 and 100.0
    val randomNumbers = List.fill(10)(Random.nextDouble() * 100)

    println("--- Generated Random Dataset ---")
    randomNumbers.foreach(n => println(f"$n%2.2f"))
    println("-" * 32)

    val n = randomNumbers.length
    val mean = randomNumbers.sum / n

    // 2. Calculate Variance: Average of squared differences from the Mean
    val variance = randomNumbers.map(x => math.pow(x - mean, 2)).sum / n

    // 3. Calculate Standard Deviation: Square root of variance
    val stdDev = math.sqrt(variance)

    // Print the results rounded nicely to 4 decimal places
    println(f"Mean:               $mean%2.4f")
    println(f"Variance:           $variance%2.4f")
    println(f"Standard Deviation: $stdDev%2.4f")
  }
}