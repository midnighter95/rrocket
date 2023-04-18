// See LICENSE.SiFive for license details.
// See LICENSE.Berkeley for license details.

package org.chipsalliance.rocket

import chisel3.util._

object CustomInstructions {
  def MNRET              = BitPat("b01110000001000000000000001110011")
  def CEASE              = BitPat("b00110000010100000000000001110011")
  def CFLUSH_D_L1        = BitPat("b111111000000?????000000001110011")
  def CDISCARD_D_L1      = BitPat("b111111000010?????000000001110011")
  def CUSTOM0            = BitPat("b?????????????????000?????0001011")
  def CUSTOM0_RS1        = BitPat("b?????????????????010?????0001011")
  def CUSTOM0_RS1_RS2    = BitPat("b?????????????????011?????0001011")
  def CUSTOM0_RD         = BitPat("b?????????????????100?????0001011")
  def CUSTOM0_RD_RS1     = BitPat("b?????????????????110?????0001011")
  def CUSTOM0_RD_RS1_RS2 = BitPat("b?????????????????111?????0001011")
  def CUSTOM1            = BitPat("b?????????????????000?????0101011")
  def CUSTOM1_RS1        = BitPat("b?????????????????010?????0101011")
  def CUSTOM1_RS1_RS2    = BitPat("b?????????????????011?????0101011")
  def CUSTOM1_RD         = BitPat("b?????????????????100?????0101011")
  def CUSTOM1_RD_RS1     = BitPat("b?????????????????110?????0101011")
  def CUSTOM1_RD_RS1_RS2 = BitPat("b?????????????????111?????0101011")
  def CUSTOM2            = BitPat("b?????????????????000?????1011011")
  def CUSTOM2_RS1        = BitPat("b?????????????????010?????1011011")
  def CUSTOM2_RS1_RS2    = BitPat("b?????????????????011?????1011011")
  def CUSTOM2_RD         = BitPat("b?????????????????100?????1011011")
  def CUSTOM2_RD_RS1     = BitPat("b?????????????????110?????1011011")
  def CUSTOM2_RD_RS1_RS2 = BitPat("b?????????????????111?????1011011")
  def CUSTOM3            = BitPat("b?????????????????000?????1111011")
  def CUSTOM3_RS1        = BitPat("b?????????????????010?????1111011")
  def CUSTOM3_RS1_RS2    = BitPat("b?????????????????011?????1111011")
  def CUSTOM3_RD         = BitPat("b?????????????????100?????1111011")
  def CUSTOM3_RD_RS1     = BitPat("b?????????????????110?????1111011")
  def CUSTOM3_RD_RS1_RS2 = BitPat("b?????????????????111?????1111011")
}

object CustomCSRs {
  val mnscratch = 0x350
  val mnepc = 0x351
  val mncause = 0x352
  val mnstatus = 0x353
  val all = {
    val res = collection.mutable.ArrayBuffer[Int]()
    res += mnscratch
    res += mnepc
    res += mncause
    res += mnstatus
    res.toArray
  }
  val all32 = {
    val res = collection.mutable.ArrayBuffer(all:_*)
    res.toArray
  }
}
