package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package pool_gpu {

@js.native
@JSGlobal
class Pool2DProgram protected () extends GPGPUProgram {
  def this(convInfo: Conv2DInfo, poolType: String, computePositions: Boolean) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}
