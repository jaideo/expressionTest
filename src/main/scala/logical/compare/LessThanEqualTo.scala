package logical.compare

trait LessThanEqualTo[A] {

  def lte(a: A, b: A): Boolean

}
object LessThanEqualTo {

  implicit object LessThanEqualToInt extends LessThanEqualTo[Int]{
    override def lte(a: Int, b: Int):Boolean = a <= b
  }

  implicit object LessThanEqualToDouble extends LessThanEqualTo[Double]{
    override def lte(a: Double, b: Double):Boolean = a <= b
  }

}

