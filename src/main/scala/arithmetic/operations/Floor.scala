package arithmetic.operations

trait Floor[A] {
  def floor(a: A): A
}
object Floor {
  implicit object FloorDouble extends Floor[Double]{
    override def floor(a: Double):Double = a.floor
  }
}