package logical.compare

trait If[A] {

  def _if[A](condition:Boolean,a: A, b: A): A

}
object If {

  implicit object IfDouble extends If[Double]{
    override def _if[A](condition:Boolean,a: A, b: A):A = if(condition) a else b
  }

  implicit object IfInt extends If[Int]{
    override def _if[A](condition:Boolean,a: A, b: A):A = if(condition) a else b
  }

  implicit object IfString extends If[String]{
    override def _if[A](condition:Boolean,a: A, b: A):A = if(condition) a else b
  }

  implicit object IfBoolean extends If[Boolean]{
    override def _if[A](condition:Boolean,a: A, b: A):A = if(condition) a else b
  }

}
