import breeze.linalg._
import breeze.stats._ // Added to use the built-in mean function

object MyBreezeAnalytics {
  def main(args: Array[String]): Unit = {

    // Unique data arrays (e.g., performance or sensor metrics)
    val metricsA = DenseVector(12.5, 24.0, 18.5, 30.2, 15.1)
    val metricsB = DenseVector(10.0, 20.5, 15.0, 28.0, 14.4)

    // Calculate total sum of the first dataset
    val totalSum = sum(metricsA)

    // Calculate the statistical mean using Breeze's stats package
    val averageValue = mean(metricsA)

    // Compute the dot product between the two metric vectors
    val correlationMetric = metricsA dot metricsB

    // Display the custom results
    println("--- Custom Dataset Analytics ---")
    println(s"Dataset A: $metricsA")
    println(s"Dataset B: $metricsB")

    println(s"\nAggregate Sum (A): $totalSum")
    println(s"Statistical Mean (A): $averageValue")
    println(s"Vector Dot Product (A · B): $correlationMetric")
    println("--------------------------------")
  }
}