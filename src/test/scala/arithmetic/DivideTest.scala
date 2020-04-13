package arithmetic

import org.scalatest.FunSuite

class DivideTest extends  FunSuite{
  val ac =  ArithmeticComponent
  test("DivideTest int divide Success"){
    assert(ac.divide(10,10)== 1)
  }

  test("DivideTest double divide Success"){
    assert(ac.divide(100,10)== 10)
  }

}
