package io.brunk.tfjs.core.kernels.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package reverse_gpu {

@js.native
@JSGlobal
class ReverseProgram protected () extends GPGPUProgram {
  def this(xShape: js.Array[Double], axis: js.Array[Double]) = this()
  var variableNames: js.Array[String] = js.native
  var outputShape: js.Array[Double] = js.native
  var userCode: String = js.native
}

}
