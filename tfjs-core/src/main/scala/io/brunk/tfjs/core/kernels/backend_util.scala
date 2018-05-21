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

package io.brunk.tfjs.core.kernels

import io.brunk.tfjs.core.TensorModule.TensorND
import io.brunk.tfjs.core.{DataType, Rank, Tensor}

import scala.scalajs.js
import js.annotation._
import js.|


@js.native
@JSGlobalScope
object Backend_util extends js.Object {
  def castTensor[T <: TensorND](x: T, dtype: DataType, backend: KernelBackend): T = js.native
  def reshapeTensor[T <: Tensor[R], R <: Rank](x: T, shape: js.Any): Tensor[R]     = js.native
}
