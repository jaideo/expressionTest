package slabtestdata

case class Slab(salary:Int,slabType:Slab.SlabType)

object Slab extends Enumeration {
  type SlabType = Value
  val Slab1  = Value("slab1")
  val Slab2  = Value("slab2")
  val Slab3  = Value("slab3")
}
