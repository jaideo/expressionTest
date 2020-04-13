package arithmetic

import org.scalatest.FunSuite

class MultiplyTest extends FunSuite{
  val ac =  ArithmeticComponent
  test("MultiplyTest int multiply Success"){
    assert(ac.multiply(10,10)== 100)
  }

  test("MultiplyTest double multiply Success"){
    assert(ac.multiply(1.1,10)== 11)
  }

}
