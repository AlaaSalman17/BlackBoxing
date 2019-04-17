// See README.md for license details.

package Adder

import chisel3._



object AdderDriver extends App {
  chisel3.Driver.execute(args, () => new Adder(2))
}

object AdderMain extends App {
  iotesters.Driver.execute(args, () => new Adder(2)) {
    c => new AdderUnitTester(c)
  }
}


object AdderRepl extends App {
  iotesters.Driver.executeFirrtlRepl(args, () => new Adder(2))
}