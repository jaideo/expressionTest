package arithmetic.operations

import scala.math.pow
trait Power[A] {
  def pw(a: A, b: A): A
}

object Power {
  implicit object PowerDouble extends Power[Double] {
    override def pw(a: Double, b: Double) = pow(a, b)
  }

}