package arithmetic.operations

trait Multiply[A] {
  def *(a: A, b: A): A
}
object Multiply {
  implicit object MultiplyInt extends Multiply[Int]{
    override def *(a: Int, b: Int):Int = a * b
  }
  implicit object MultiplyDouble extends Multiply[Double]{
    override def *(a: Double, b: Double):Double = a * b
  }
}