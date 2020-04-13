package slabtestdata

import arithmetic.ArithmeticComponent.{add, divide, min, multiply, subtract}
import logical.LogicalComponent
import logical.LogicalComponent._if

import scala.collection.mutable.ListBuffer

object SlabProcessor {
  def slab1(salary: Int): Double = {
    val isLessThanOrEqualTo: Boolean = LogicalComponent.isLessThanOrEqualTo(salary, 250000)
    val tax = _if(isLessThanOrEqualTo, 0, divide(multiply(min(250000, subtract(salary, 250000)), 5), 100))
    isLessThanOrEqualTo match {
      case true => printStatement(salary, "slab1", tax, "No tax till Rs 2,50,000 ")
      case false => printStatement(salary, "slab1", tax, "5% tax till salary upto 5,00,000")
    }
    tax
  }

  def slab2(salary: Int): Double = {
    val isGreaterThan: Boolean = LogicalComponent.isGreaterThan(salary, 500000)
    val tax = _if(isGreaterThan, divide(multiply(min(500000, subtract(salary, 500000)), 20), 100), 0)
    isGreaterThan match {
      case false => printStatement(salary, "slab2", tax, "Slab applicable for salary above 5,00,000")
      case true => printStatement(salary, "slab2", tax, "20% tax for salary between 5,00,000 and 10,00,000")
    }
    tax
  }

  def slab3(salary: Int): Double = {
    val isGreaterThan: Boolean = LogicalComponent.isGreaterThan(salary, 1000000)
    val tax = _if(isGreaterThan, divide(multiply(subtract(salary, 1000000), 30), 100), 0)
    isGreaterThan match {
      case false => printStatement(salary, "slab3", tax, "Slab applicable for salary above 10,00,000")
      case true => printStatement(salary, "slab3", tax, "30% tax for salary greater than 10,00,000")
    }
    tax
  }

  val printStatement = (salary: Int, slabType: String, tax: Double, explanation: String) =>
    println(s"salary -> $salary " ++ s" $slabType -> $tax " ++ s" Explanation -> $explanation ")

  val slabAddition = (list: ListBuffer[Double]) => list.reduceLeft(_ + _)

  val cess = (slabAddition: Double) => divide(multiply(slabAddition, 4), 100)

  val totalTax = (slabAddition: Double, cess: Double) => {
    val ttax = add(slabAddition,cess)
    println (s" Total Tax -> $ttax")
    ttax
  }
}
