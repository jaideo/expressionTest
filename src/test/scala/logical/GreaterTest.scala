package logical

import org.scalatest.FunSuite

class GreaterTest extends FunSuite{

  val lc = LogicalComponent

  test("GreaterTest is greater than "){
    assert(lc.isGreaterThan(100,99))
    assert(lc.isGreaterThan(99,98))
    assert(!lc.isGreaterThan(98,99))
    assert(lc.isGreaterThan(1,-2))
  }



}
