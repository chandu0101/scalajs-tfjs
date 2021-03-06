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

package unaryop_gpu {

  import io.brunk.deeplearnjs.math.backends.webgl.gpgpu_math.GPGPUProgram

  @js.native
  @JSGlobal
  class UnaryOpProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], opSnippet: String) = this()
    var variableNames: js.Array[String] = js.native
    var userCode: String                = js.native
    var outputShape: js.Array[Double]   = js.native
  }

  @js.native
  @JSGlobalScope
  object Unaryop_gpu extends js.Object {
    val ABS: String                       = js.native
    val RELU: String                      = js.native
    val ELU: String                       = js.native
    val ELU_DER: String                   = js.native
    val SELU: String                      = js.native
    def LEAKY_RELU(alpha: Double): String = js.native
    def STEP(alpha: Double = ???): String = js.native
    val NEG: String                       = js.native
    val CEIL: String                      = js.native
    val FLOOR: String                     = js.native
    val EXP: String                       = js.native
    val LOG: String                       = js.native
    val SQRT: String                      = js.native
    val SIGMOID: String                   = js.native
    val SIN: String                       = js.native
    val COS: String                       = js.native
    val TAN: String                       = js.native
    val ASIN: String                      = js.native
    val ACOS: String                      = js.native
    val ATAN: String                      = js.native
    val SINH: String                      = js.native
    val COSH: String                      = js.native
    val TANH: String                      = js.native
    val SQUARE: String                    = js.native
    val TO_INT: String                    = js.native
  }

}
