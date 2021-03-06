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
import js.annotation._
import js.|

import scala.scalajs.js.typedarray.{ Float32Array, Int32Array }

@js.native
trait RandGauss extends js.Object {
  def nextValue(): Double
}

@js.native
trait RandNormalDataTypes extends js.Object {
  var float32: Float32Array
  var int32: Int32Array
}

@js.native
@JSGlobal
class MPRandGauss protected () extends RandGauss {
  def this(mean: Double,
           stdDeviation: Double,
           dtype: String = ???,
           truncated: Boolean = ???,
           seed: Double = ???) = this()
  def nextValue(): Double = js.native
}
