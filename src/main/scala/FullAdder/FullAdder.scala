// See LICENSE.txt for license details.
package Adder

import chisel3._
import chisel3.util._
import chisel3.experimental._


class FullAdder extends BlackBox with HasBlackBoxInline {
  val io = IO(new Bundle {
    val a    = Input(UInt(1.W))
    val b    = Input(UInt(1.W))
    val cin  = Input(UInt(1.W))
    val sum  = Output(UInt(1.W))
    val cout = Output(UInt(1.W))
  })

  setInline("FullAdder.v",
    s"""
|
|   module top(
|    input a,
|    input b,
|    input cin,
|    output sum,
|    output cout);    
|   
|   
|   assign sum = (a ^ b ^ cin);
|   assign cout = ( (a&&b) || (a&&cin) || (b&cin) ); endgenerate  
| 
| endmodule
""".stripMargin)

}
