package logical.compare

trait Compare[A] {

  def eq[A](a: A, b: A): Boolean

}

object Compare {

  implicit object CompareDouble extends Compare[Double]{
    override def eq[A](a: A, b: A):Boolean = a == b
  }

  implicit object CompareInt extends Compare[Int]{
    override def eq[A](a: A, b: A):Boolean = a == b
  }

  implicit object CompareString extends Compare[String]{
    override def eq[A](a: A, b: A):Boolean = a == b
  }

  implicit object CompareBoolean extends Compare[Boolean]{
    override def eq[A](a: A, b: A):Boolean = a == b
  }

}
