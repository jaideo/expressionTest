package arithmetic

import org.scalatest.FunSuite

class AddTest extends FunSuite {
  val ac =  ArithmeticComponent
  test("AddTest float add Success") {
    assert(ac.add(10.1,10) == 20.1)
  }
  test("AddTest int add Success") {
    assert(ac.add(5,10) == 15)
  }

}
