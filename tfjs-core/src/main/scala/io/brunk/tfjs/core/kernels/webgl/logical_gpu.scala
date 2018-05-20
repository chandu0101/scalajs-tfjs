package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
class WhereProgram protected () extends GPGPUProgram {
  def this(cRank: Double, shape: js.Array[Double], rank: Double) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}