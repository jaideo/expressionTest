package arithmetic

import org.scalatest.FunSuite

class SubtractTest extends FunSuite{
  val ac =  ArithmeticComponent
  test("SubtractTest float minus Success") {
    assert(ac.subtract(20.1,10.1).floor == 10.0)
  }
  test("SubtractTest int minus Success") {
    assert(ac.subtract(5,10) == -5)
    assert(ac.subtract(15,10) == 5)
  }
}
