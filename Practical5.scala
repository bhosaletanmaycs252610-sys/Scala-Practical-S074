import breeze.linalg._

object BreezeMatrixPractical {
  def main(args: Array[String]): Unit = {

    println("=== Step 1: Generating a Random $3 \times 3$ Matrix ===")
    // DenseMatrix.rand generates a matrix with random Double values between 0.0 and 1.0
    val randomMatrix = DenseMatrix.rand[Double](3, 3)
    println(randomMatrix)
    println()

    println("=== Step 2: Computing the Transpose ===")
    // In Breeze, the 't' method computes the transpose of a matrix
    val transposedMatrix = randomMatrix.t
    println(transposedMatrix)
    println()

    println("=== Step 3: Computing the Determinant ===")
    // det() calculates the determinant of a square matrix
    val matrixDeterminant = det(randomMatrix)
    println(s"Determinant of the matrix: $matrixDeterminant")
  }
}