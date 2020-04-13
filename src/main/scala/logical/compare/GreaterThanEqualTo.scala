package logical.compare

trait GreaterThanEqualTo[A] {

  def gte(a: A, b: A): Boolean

}
object GreaterThanEqualTo {

  implicit object GreaterThanEqualToInt extends GreaterThanEqualTo[Int]{
    override def gte(a: Int, b: Int):Boolean = a >= b
  }

  implicit object GreaterThanEqualToDouble extends GreaterThanEqualTo[Double]{
    override def gte(a: Double, b: Double):Boolean = a >= b
  }

}

