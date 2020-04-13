package arithmetic.operations

trait Add[A] {
  def +(a: A, b: A): A
}
object Add {

  implicit object SummableInt extends Add[Int]{
    override def +(a: Int, b: Int):Int = a + b
  }

  implicit object SummableDouble extends Add[Double]{
    override def +(a: Double, b: Double):Double = a + b
  }

}
