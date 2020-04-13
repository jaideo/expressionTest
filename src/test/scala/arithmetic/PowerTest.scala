package arithmetic

import org.scalatest.FunSuite

class PowerTest extends FunSuite{
  val ac =  ArithmeticComponent
  test("PowerTest int power Success"){
    assert(ac.power(10.0,2)==100)
  }
}
