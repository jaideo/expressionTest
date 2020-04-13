package date

import org.joda.time.LocalDate

trait DateComponentT {
    def difference(d1:LocalDate,d2:LocalDate)=()

    def addDays(date: LocalDate,days:Int) = ()

    def subtractDays(date: LocalDate,days:Int)=()
}
