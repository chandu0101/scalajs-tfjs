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

package io.brunk.deeplearnjs.math.backends.types

import io.brunk.deeplearnjs.Util.NamedArrayMap
import io.brunk.deeplearnjs.math.{ DataType, Int32, NDArray, Rank }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait PowNode[T <: NDArray[DataType, Rank]] extends KernelNode {
  var inputAndArgs: PowInputConfig[T] = js.native
  // var output: T                       = js.native
  //var gradient: js.Function2[T, T, PowGradientInputArrays[T]] = js.native
}

@js.native
trait PowInputConfig[T <: NDArray[DataType, Rank]] extends KernelInputConfig {
  var inputs: PowInputArrays[T] = js.native
}

@js.native
trait PowInputArrays[T <: NDArray[DataType, Rank]] extends NamedArrayMap {
  var a: T                    = js.native
  var b: NDArray[Int32, Rank] = js.native
}

@js.native
trait PowGradientInputArrays[T <: NDArray[DataType, Rank]] extends TapeNodeInputGradientArrays {
  var a: js.Function0[T]                    = js.native
  var b: js.Function0[NDArray[Int32, Rank]] = js.native
}
