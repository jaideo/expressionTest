package logical

import org.scalatest.FunSuite

class LessThanEqualToTest extends FunSuite{
  val lc = LogicalComponent

  assert(lc.isLessThanOrEqualTo(99,100))
  assert(lc.isLessThanOrEqualTo(100,100))
  assert(lc.isLessThanOrEqualTo(-99.1,-99.1))
  assert(lc.isLessThanOrEqualTo(-99.02,-99.01))
}
