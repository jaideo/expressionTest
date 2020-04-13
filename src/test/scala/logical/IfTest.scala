package logical

import org.scalatest.FunSuite

class IfTest extends FunSuite {

  val lc = LogicalComponent

  test("IfTest _if "){
    assert(lc._if(true,0,1200)==0)
    assert(lc._if(false,0,1200)==1200)

    assert(lc._if(true,true,false))
    assert(!lc._if(false,true,false))

    assert(lc._if(true,0.0,1200.00)==0.0)
    assert(lc._if(false,0.0,1200.001)==1200.001)

    assert(lc._if(true,"true return","false return")=="true return")
    assert(lc._if(false,"true return","false return")=="false return")
  }
}
