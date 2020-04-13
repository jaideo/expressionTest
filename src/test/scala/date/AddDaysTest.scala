package date

import org.joda.time.LocalDate
import org.scalatest.FunSuite

class AddDaysTest extends FunSuite{
  val dt = DateComponent
  test("AddDaysTest add days "){
    assert(dt.addDays(LocalDate.parse("2020-01-15"),10) ==  LocalDate.parse("2020-01-25"))
  }
}
