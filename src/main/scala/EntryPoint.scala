import slabtestdata.SlabProcessor.{slab1, slab2, slab3}
import slabtestdata.{Slab, SlabProcessor, TestData}

import scala.collection.mutable.ListBuffer


object EntryPoint extends App{

  val list :List[Slab] = TestData.testData
 // var slabTaxList:List[Double]=List.empty[Double]
  var slabTaxList = new ListBuffer[Double]()
  for(l <- list){
   l.slabType match {
     case Slab.Slab1 => slabTaxList.append(slab1(l.salary))
     case Slab.Slab2 => slabTaxList.append(slab2(l.salary))
     case Slab.Slab3 => slabTaxList.append(slab3(l.salary))
   }
  }
  val slabAddition = SlabProcessor.slabAddition(slabTaxList)
  val cess = SlabProcessor.cess(slabAddition)
  val totalTax = SlabProcessor.totalTax(slabAddition,cess)
}
