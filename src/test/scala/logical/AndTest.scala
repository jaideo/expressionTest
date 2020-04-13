package logical

import org.scalatest.FunSuite

class AndTest extends FunSuite{
  val lc = LogicalComponent
  test("AndTest and"){
    assert(lc.and(true,true))
    assert(!lc.and(true,false))
    assert(!lc.and(false,true))
    assert(!lc.and(false,false))
  }
}
