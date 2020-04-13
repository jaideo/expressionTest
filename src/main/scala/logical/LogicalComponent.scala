package logical

import logical.compare._

object LogicalComponent {

  def and(op1:Boolean,op2:Boolean):Boolean=op1 && op2

  def or(op1:Boolean,op2:Boolean) :Boolean= op1 || op2

  def not(op1:Boolean) : Boolean = !op1

  def equal[T](op1:T,op2:T)(implicit eq: Compare[T]) : Boolean = eq.eq(op1,op2)

  def isGreaterThan[T](op1:T,op2:T) (implicit gt: Greater[T]): Boolean= gt.>(op1,op2)

  def isGreaterThanOrEqualTo[T](op1:T,op2:T) (implicit gte: GreaterThanEqualTo[T]): Boolean= gte.gte(op1,op2)

  def isLessThanOrEqualTo[T](op1:T,op2:T) (implicit lte: LessThanEqualTo[T]): Boolean= lte.lte(op1,op2)

  def _if[T](condition:Boolean,valueTrue:T,valueFalse:T)(implicit `if`: If[T]):T= `if`._if(condition,valueTrue,valueFalse)

}
