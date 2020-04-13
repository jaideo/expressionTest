package date

import org.joda.time.{Days, LocalDate}

object DateComponent /*extends DateComponentT*/ {

   def difference(d1:LocalDate,d2:LocalDate):Int= Math.abs(Days.daysBetween(d1, d2 ).getDays())

   def addDays(date: LocalDate,days:Int) :LocalDate= date.plusDays(days)

   def subtractDays(date: LocalDate,days:Int):LocalDate=date.minusDays(days)
}
