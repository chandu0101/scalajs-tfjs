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

package io.brunk.deeplearnjs.graph.ops

import io.brunk.deeplearnjs.graph.{ SummedTensorArrayMap, Tensor, TensorArrayMap }
import io.brunk.deeplearnjs.math.{ ElementWiseCostFunction, NDArrayMath }

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSGlobal
class ElementWiseCost protected () extends Operation {
  def this(x1Tensor: Tensor, x2Tensor: Tensor, yTensor: Tensor, func: ElementWiseCostFunction) =
    this()
  protected var x1Tensor: Tensor                                            = js.native
  protected var x2Tensor: Tensor                                            = js.native
  protected var yTensor: Tensor                                             = js.native
  protected var func: ElementWiseCostFunction                               = js.native
  def feedForward(math: NDArrayMath, inferenceArrays: TensorArrayMap): Unit = js.native
  def backProp(math: NDArrayMath,
               inferenceArrays: TensorArrayMap,
               gradientArrays: SummedTensorArrayMap): Unit = js.native
  override def dispose(): Unit                             = js.native
}

@js.native
@JSGlobal
class MeanSquaredCost protected () extends ElementWiseCost {
  def this(x1Tensor: Tensor, x2Tensor: Tensor, yTensor: Tensor) = this()
}
