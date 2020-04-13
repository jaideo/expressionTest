package arithmetic.operations

trait Min[A] {
 def min(a:A,b:A):A
}

object Min {

  implicit object MinInt extends Min[Int]{
    override def min(a: Int, b: Int):Int = if(a<b)a else b
  }

  implicit object MinDouble extends Min[Double]{
    override def min(a: Double, b: Double):Double = if(a<b)a else b
  }

}
