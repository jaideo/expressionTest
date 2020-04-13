package arithmetic

import arithmetic.operations._

object ArithmeticComponent {

  def add[A](a: A, b: A)(implicit ad: Add[A]) = ad.+(a, b)

  def subtract[A](a:A,b:A)(implicit sub :Subtract[A])= sub.-(a,b)

  def multiply[A](a:A,b:A)(implicit mul :Multiply[A])= mul.*(a,b)

  def divide[A](a:A,b:A)(implicit div :Divide[A])= div./(a,b)

  def power[A](a:A,b:A)(implicit pw :Power[A])= pw.pw(a,b)

  def ceil[A](a:A)(implicit  cl: Ceil[A])=cl.ceil(a)

  def floor[A](a:A)(implicit  fl: Floor[A])=fl.floor(a)

  def min[A](a:A,b:A)(implicit  mn: Min[A])=mn.min(a,b)

}

