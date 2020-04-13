package arithmetic

import org.scalatest.FunSuite

class FloorTest extends FunSuite{
  val ac =  ArithmeticComponent
  test("FloorTest double floor Success"){
    assert(ac.floor(10.09)==10.00)
  }
}
