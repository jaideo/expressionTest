package date

import org.joda.time.LocalDate
import org.scalatest.FunSuite

class MinusDaysTest extends FunSuite{
  val dt = DateComponent

  test("MinusDaysTest subtract days "){
    assert(dt.subtractDays(LocalDate.parse("2020-01-25"),10) == LocalDate.parse("2020-01-15"))
  }
}
