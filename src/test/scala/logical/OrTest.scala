package logical

import org.scalatest.FunSuite

class OrTest extends FunSuite{
  val lc = LogicalComponent
  test("OrTest or"){
    assert(lc.or(true,true))
    assert(lc.or(true,false))
    assert(lc.or(false,true))
    assert(!lc.or(false,false))
  }
}
