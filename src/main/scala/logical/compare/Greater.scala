package logical.compare

trait Greater[A] {

  def >(a: A, b: A): Boolean

}
object Greater {

  implicit object GreaterInt extends Greater[Int]{
    override def >(a: Int, b: Int):Boolean = a > b
  }

  implicit object GreaterDouble extends Greater[Double]{
    override def >(a: Double, b: Double):Boolean = a > b
  }

}
