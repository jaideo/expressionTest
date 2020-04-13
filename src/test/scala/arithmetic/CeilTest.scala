package arithmetic

import org.scalatest.FunSuite

class CeilTest extends FunSuite{
  val ac =  ArithmeticComponent
  test("CeilTest double ceil Success"){
    assert(ac.ceil(10.02)==11.00)
  }
}
