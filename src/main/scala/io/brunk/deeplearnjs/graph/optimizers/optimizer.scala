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

package io.brunk.deeplearnjs.graph.optimizers

import io.brunk.deeplearnjs.graph.{ Node, SummedTensorArrayMap, TensorArrayMap, VariableNode }
import io.brunk.deeplearnjs.graph.Session.SessionRuntime
import io.brunk.deeplearnjs.math.{ NDArrayMath, Scalar }

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

@js.native
@JSImport("deeplearn", "Optimizer")
abstract class Optimizer protected () extends js.Object {
  def this(learningRate: Double, specifiedVariableList: js.Array[Node] = ???) = this()
  protected var learningRate: Double                                  = js.native
  protected var variableNodes: js.Array[VariableNode]                 = js.native
  protected var specifiedVariableNodes: js.Array[VariableNode] | Null = js.native
  def beforeBatch(math: NDArrayMath,
                  batchSize: Double,
                  runtime: SessionRuntime,
                  activationArrayMap: TensorArrayMap,
                  gradientArrayMap: SummedTensorArrayMap): Unit = js.native
  def afterExample(math: NDArrayMath,
                   runtime: SessionRuntime,
                   activationArrayMap: TensorArrayMap,
                   gradientArrayMap: SummedTensorArrayMap): Unit = js.native
  def afterBatch(math: NDArrayMath,
                 batchSize: Double,
                 runtime: SessionRuntime,
                 activationArrayMap: TensorArrayMap,
                 gradientArrayMap: SummedTensorArrayMap): Unit
  def dispose(): Unit                             = js.native
  protected var variableGradients: TensorArrayMap = js.native
  protected var prevBatchSize: Double             = js.native
  protected var one: Scalar                       = js.native
  protected var c: Scalar                         = js.native
}
