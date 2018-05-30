package io.brunk.tfjs.layers

import scala.scalajs.js
import js.annotation._
import js.|

@js.native
@JSGlobal
abstract class Activation extends serialization.Serializable {
  @JSName("apply")
  def apply(tensor: Tensor, axis: Double = ???): Tensor
  def getConfig(): serialization.ConfigDict = js.native
}

@js.native
@JSGlobal
class Elu extends Activation {
  @JSName("apply")
  def apply(x: Tensor, alpha: Double = ???): Tensor = js.native
}

@js.native
@JSGlobal
object Elu extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Selu extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Selu extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Relu extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Relu extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Relu6 extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Relu6 extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Linear extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Linear extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Sigmoid extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Sigmoid extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class HardSigmoid extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object HardSigmoid extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Softplus extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Softplus extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Softsign extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Softsign extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Tanh extends Activation {
  @JSName("apply")
  def apply(x: Tensor): Tensor = js.native
}

@js.native
@JSGlobal
object Tanh extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobal
class Softmax extends Activation {
  @JSName("apply")
  def apply(x: Tensor, axis: Double = ???): Tensor = js.native
}

@js.native
@JSGlobal
object Softmax extends js.Object {
  def className: String = js.native
}

@js.native
@JSGlobalScope
object Activations extends js.Object {
  type ActivationIdentifier = String
  def serializeActivation(activation: Activation): String = js.native
  def deserializeActivation(config: serialization.ConfigDict, customObjects: serialization.ConfigDict = ???): Activation = js.native
  def getActivation(identifier: ActivationIdentifier | serialization.ConfigDict | Activation): Activation = js.native
}
