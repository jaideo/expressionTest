package logical

import org.scalatest.FunSuite

class NotTest extends FunSuite {

  val lc = LogicalComponent

  test("NotTest not"){
    assert(!lc.not(true))
    assert(lc.not(false))
  }

}
