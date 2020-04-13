package date

import org.joda.time.LocalDate
import org.scalatest.FunSuite

class DifferenceTest extends FunSuite{
  val dt = DateComponent
  test("DifferenceTest difference ") {
    assert(dt.difference(LocalDate.parse("2020-01-15") , LocalDate.parse("2020-01-25")) == 10 )
    assert(dt.difference(LocalDate.parse("2020-01-27") , LocalDate.parse("2020-01-13")) == 14 )
    assert(dt.difference(LocalDate.parse("2020-01-01") , LocalDate.parse("2020-01-31")) == 30 )
    assert(dt.difference(LocalDate.parse("1920-01-27") , LocalDate.parse("1920-01-27")) == 0 )
  }
}
