package arithmetic.operations

trait Ceil[A] {
  def ceil(a: A): A
}
object Ceil {
  implicit object CeilDouble extends Ceil[Double]{
    override def ceil(a: Double):Double = a.ceil
  }
}
