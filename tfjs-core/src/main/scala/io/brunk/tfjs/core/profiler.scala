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

package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|
import kernels.BackendTimer
import Types.TypedArray
import TensorModule.TensorND

@js.native
@JSGlobal
class Profiler protected () extends js.Object {
  def this(backendTimer: BackendTimer, logger: Logger = ???) = this()
  def profileKernel[T <: TensorND](name: String, f: js.Function0[T]): T = js.native
}

@js.native
@JSGlobal
class Logger extends js.Object {
  def logKernelProfile(name: String, result: TensorND, vals: TypedArray, timeMs: Double): Unit =
    js.native
}
