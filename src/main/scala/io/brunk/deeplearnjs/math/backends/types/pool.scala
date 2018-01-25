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
import io.brunk.deeplearnjs.math.Conv_util.Conv2DInfo
import io.brunk.deeplearnjs.math.backends.Tape_types.TapeNodeInputGradientArrays
import io.brunk.deeplearnjs.math.backends.{ KernelInputConfig, KernelNode }

import scala.scalajs.js

@js.native
trait PoolNode extends KernelNode {
  var inputAndArgs: PoolInputConfig = js.native
  var output: Array4D[DataType]     = js.native
  var gradient: js.Function2[Array4D[DataType], Array4D[DataType], PoolGradientInputArrays] =
    js.native
}

@js.native
trait PoolInputConfig extends KernelInputConfig {
  var inputs: PoolInputArrays    = js.native
  var args: PoolInputConfig.Args = js.native
}

object PoolInputConfig {

  @js.native
  trait Args extends js.Object {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait PoolInputArrays extends NamedArrayMap {
  var x: Array4D[DataType] = js.native
}

@js.native
trait PoolGradientInputArrays extends TapeNodeInputGradientArrays {
  var x: js.Function0[Array4D[DataType]] = js.native
}

@js.native
trait PoolBackpropNode extends KernelNode {
  var inputAndArgs: PoolInputConfig = js.native
  var output: Array4D[DataType]     = js.native
  var gradient
    : js.Function2[Array4D[DataType], Array4D[DataType], PoolBackpropGradientInputArrays] =
    js.native
}

@js.native
trait PoolBackpropInputConfig extends KernelInputConfig {
  var inputs: PoolBackpropInputArrays    = js.native
  var args: PoolBackpropInputConfig.Args = js.native
}

object PoolBackpropInputConfig {

  @js.native
  trait Args extends js.Object {
    var convInfo: Conv2DInfo = js.native
  }
}

@js.native
trait PoolBackpropInputArrays extends NamedArrayMap {
  var dy: Array4D[DataType] = js.native
  var x: Array4D[DataType]  = js.native
}

@js.native
trait PoolBackpropGradientInputArrays extends TapeNodeInputGradientArrays {
  var dy: js.Function0[Array4D[DataType]] = js.native
  var x: js.Function0[Array4D[DataType]]  = js.native
}
