package arithmetic

import org.scalatest.FunSuite

class MinTest extends FunSuite{

  val ac =  ArithmeticComponent

  test("MinTest int min Success"){
    assert(ac.min(10,9)==9)
  }

  test("MinTest double min Success"){
    assert(ac.min(10.1,10.2)==10.1)
  }

}
