/*
 * Copyright 2017 Sören Brunk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.brunk.deeplearnjs.math.backends.webgl

import scala.scalajs.js
import js.annotation._
import js.|

package mulmat_packed_gpu {

  import io.brunk.deeplearnjs.math.backends.types.MatrixOrientation
  import io.brunk.deeplearnjs.math.backends.webgl.gpgpu_context.GPGPUContext
  import org.scalajs.dom.webgl

  import scala.scalajs.js.typedarray.Float32Array

  @js.native
  @JSGlobalScope
  object Mulmat_packed_gpu extends js.Object {
    def getFragmentShaderSource(sharedDimension: Double,
                                aOrientation: MatrixOrientation,
                                bOrientation: MatrixOrientation): String = js.native
    def multiplyMatrixPacked(gpgpu: GPGPUContext,
                             multiplyProgram: webgl.Program,
                             a: webgl.Texture,
                             b: webgl.Texture,
                             result: webgl.Texture,
                             resultShapeRowCol: js.Tuple2[Double, Double]): Unit = js.native
    def uploadMultiplyMatrixPackedDownload(a: Float32Array,
                                           aShapeRowCol: js.Tuple2[Double, Double],
                                           b: Float32Array,
                                           bShapeRowCol: js.Tuple2[Double, Double],
                                           aOrientation: MatrixOrientation = ???,
                                           bOrientation: MatrixOrientation = ???): Float32Array =
      js.native
  }

}
