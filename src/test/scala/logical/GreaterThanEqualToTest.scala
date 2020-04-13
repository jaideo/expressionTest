package logical

import org.scalatest.FunSuite

class GreaterThanEqualToTest extends FunSuite{

  val lc = LogicalComponent

  test("GreaterThanEqualToTest is greater than or equal to "){
    assert(lc.isGreaterThanOrEqualTo(100,99))
    assert(lc.isGreaterThanOrEqualTo(100,100))
    assert(lc.isGreaterThanOrEqualTo(-99.1,-99.1))
    assert(lc.isGreaterThanOrEqualTo(-99.01,-99.02))
  }
}
