/*
 * Copyright (c) 2017 Sören Brunk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.brunk.deeplearnjs.math.webgl

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
  @JSGlobalScope
  object Mulmat_packed_gpu extends js.Object {
    def getFragmentShaderSource(sharedDimension: Double,
                                aOrientation: MatrixOrientation,
                                bOrientation: MatrixOrientation): String = js.native
    def multiplyMatrixPacked(gpgpu: GPGPUContext,
                             multiplyProgram: WebGLProgram,
                             a: WebGLTexture,
                             b: WebGLTexture,
                             result: WebGLTexture,
                             resultShapeRowCol: js.Tuple2[Double, Double]): Unit = js.native
    def uploadMultiplyMatrixPackedDownload(a: Float32Array,
                                           aShapeRowCol: js.Tuple2[Double, Double],
                                           b: Float32Array,
                                           bShapeRowCol: js.Tuple2[Double, Double],
                                           aOrientation: MatrixOrientation = ???,
                                           bOrientation: MatrixOrientation = ???): Float32Array =
      js.native
  }
