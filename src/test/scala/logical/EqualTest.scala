package logical

import org.scalatest.FunSuite

class EqualTest extends FunSuite {

  val lc = LogicalComponent

  test("EqualTest equal "){
    assert(lc.equal(true,true))
    assert(lc.equal("abcd","abcd"))
    assert(lc.equal(1000,1000))
    assert(lc.equal(11.11,11.11))
  }

  test("EqualTest not equal "){
    assert(!lc.equal(true,false))
    assert(!lc.equal("abcd","dfgh"))
    assert(!lc.equal(1000,1111))
    assert(!lc.equal(11.11,11))
  }
}
