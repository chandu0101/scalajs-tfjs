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
import io.brunk.deeplearnjs.math.{ Array4D, DataType }
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait LRN4DNode extends KernelNode {
  var inputAndArgs: LRN4DInputConfig = js.native
  var output: Array4D[DataType]      = js.native
  // var gradient: js.Function2[Array4D[DataType], Array4D[DataType], LRN4DGradientInputArrays] = js.native
}

@js.native
trait LRN4DInputConfig extends KernelInputConfig {
  var inputs: LRN4DInputArrays    = js.native
  var args: LRN4DInputConfig.Args = js.native
}

object LRN4DInputConfig {

  @js.native
  trait Args extends KernelInputConfig.Args {
    var radius: Double     = js.native
    var bias: Double       = js.native
    var alpha: Double      = js.native
    var beta: Double       = js.native
    var normRegion: String = js.native
  }
}

@js.native
trait LRN4DInputArrays extends NamedArrayMap {
  var x: Array4D[DataType] = js.native
}

@js.native
trait LRN4DGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D[DataType]] = js.native
}
