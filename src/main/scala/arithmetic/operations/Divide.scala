package arithmetic.operations

import scala.util.Try

trait Divide[A] {
  def /(a: A, b: A): A
}

object Divide {
  implicit object DivideAbleInt extends Divide[Int] {
    override def /(a: Int, b: Int):Int = Try(a / b ).recover{ case _: ArithmeticException => 0 }.get
  }
  implicit object DivideAbleDouble extends Divide[Double] {
    override def /(a: Double, b: Double):Double = Try(a / b ).recover{ case _: ArithmeticException => 0.0 }.get

  }
}