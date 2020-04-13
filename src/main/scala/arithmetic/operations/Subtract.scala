package arithmetic.operations

trait Subtract[A] {
  def -(a: A, b: A): A
}

object Subtract {

  implicit object SubtractableInt extends Subtract[Int] {
    override def -(a: Int, b: Int) = a - b
  }
  implicit object SubtractableDouble extends Subtract[Double] {
    override def -(a: Double, b: Double) = a - b
  }
}