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

package io.brunk.deeplearnjs.math

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobalScope
object Concat_util extends js.Object {
  def assertParams(aShape: js.Array[Double], bShape: js.Array[Double], axis: Double): Unit =
    js.native
  def computeOutShape1D(x1Shape: js.Array[Double], x2Shape: js.Array[Double]): js.Array[Double] =
    js.native
  def computeOutShape(x1Shape: js.Array[Double],
                      x2Shape: js.Array[Double],
                      axis: Double): js.Array[Double] = js.native
  def computeGradientSliceShapes2D(x1TensorShape: js.Array[Double],
                                   yTensorShape: js.Array[Double],
                                   axis: Double): js.Any = js.native
  def computeGradientSliceShapes3D(x1Shape: js.Array[Double],
                                   yShape: js.Array[Double],
                                   axis: Double): js.Any = js.native
  def computeGradientSliceShapes4D(x1TensorShape: js.Array[Double],
                                   yTensorShape: js.Array[Double],
                                   axis: Double): js.Any = js.native
}
