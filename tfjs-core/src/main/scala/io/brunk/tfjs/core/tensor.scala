package io.brunk.tfjs.core

import scala.scalajs.js
import js.annotation._
import js.|

package tensor {

@js.native
trait TensorData extends js.Object {
  var dataId: DataId = js.native
  var values: TypedArray = js.native
}

@js.native
@JSGlobal
class TensorBuffer[R <: Rank] protected () extends js.Object {
  def this(shape: js.Any, dtype: DataType, values: TypedArray) = this()
  var dtype: DataType = js.native
  var size: Double = js.native
  var shape: js.Any = js.native
  var strides: js.Array[Double] = js.native
  var values: TypedArray = js.native
  def set(value: Double, locs: Double*): Unit = js.native
  def get(locs: Double*): Double = js.native
  def locToIndex(locs: js.Array[Double]): Double = js.native
  def indexToLoc(index: Double): js.Array[Double] = js.native
  def rank: Double = js.native
  def toTensor(): Tensor[R] = js.native
}

@js.native
@JSGlobal
class Tensor[R <: Rank] protected () extends js.Object {
  def this(shape: js.Any, dtype: DataType, values: TypedArray = ???, dataId: DataId = ???) = this()
  def id: Double = js.native
  var dataId: DataId = js.native
  def shape: js.Any = js.native
  def size: Double = js.native
  def dtype: DataType = js.native
  def rankType: R = js.native
  def strides: js.Array[Double] = js.native
  def flatten(): Tensor1D = js.native
  def asScalar(): Scalar = js.native
  def as1D(): Tensor1D = js.native
  def as2D(rows: Double, columns: Double): Tensor2D = js.native
  def as3D(rows: Double, columns: Double, depth: Double): Tensor3D = js.native
  def as4D(rows: Double, columns: Double, depth: Double, depth2: Double): Tensor4D = js.native
  def asType[T <: this.type](`this`: T, dtype: DataType): T = js.native
  def rank: Double = js.native
  def get(locs: Double*): Double = js.native
  def buffer(): TensorBuffer[R] = js.native
  def data(): Promise[TypedArray] = js.native
  def dataSync(): TypedArray = js.native
  def dispose(): Unit = js.native
  def toFloat[T <: this.type](`this`: T): T = js.native
  def toInt(): this.type = js.native
  def toBool(): this.type = js.native
  def print(verbose: Boolean = ???): Unit = js.native
  def reshape[R2 <: Rank](newShape: js.Any): Tensor[R2] = js.native
  def reshapeAs[T <: Tensor](x: T): T = js.native
  def expandDims[R2 <: Rank](axis: Double = ???): Tensor[R2] = js.native
  def cumsum[T <: Tensor](axis: Double = ???, exclusive: Boolean = ???, reverse: Boolean = ???): T = js.native
  def squeeze[T <: Tensor](axis: js.Array[Double] = ???): T = js.native
  def clone[T <: Tensor](`this`: T): T = js.native
  def toString(verbose: Boolean = ???): String = js.native
  def tile[T <: this.type](`this`: T, reps: js.Array[Double]): T = js.native
  def gather[T <: this.type](`this`: T, indices: Tensor1D, axis: Double = ???): T = js.native
  def matMul(b: Tensor2D, transposeA: Boolean = ???, transposeB: Boolean = ???): Tensor2D = js.native
  def norm(ord: Double | String = ???, axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): Tensor = js.native
  def slice[T <: Tensor[R]](`this`: T, begin: Double | js.Array[Double], size: Double | js.Array[Double] = ???): T = js.native
  def reverse[T <: Tensor](`this`: T, axis: Double | js.Array[Double] = ???): T = js.native
  def concat[T <: Tensor](`this`: T, x: T, axis: Double = ???): T = js.native
  def stack(x: Tensor, axis: Double = ???): Tensor = js.native
  def unstack(x: Tensor, axis: Double = ???): js.Array[Tensor] = js.native
  def pad[T <: Tensor](`this`: T, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double = ???): T = js.native
  def batchNormalization(mean: Tensor[R] | Tensor1D, variance: Tensor[R] | Tensor1D, varianceEpsilon: Double = ???, scale: Tensor[R] | Tensor1D = ???, offset: Tensor[R] | Tensor1D = ???): Tensor[R] = js.native
  def logSumExp[T <: Tensor](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def sum[T <: Tensor](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def mean[T <: Tensor](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def min[T <: Tensor](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def max[T <: Tensor](axis: Double | js.Array[Double] = ???, keepDims: Boolean = ???): T = js.native
  def argMin[T <: Tensor](axis: Double = ???): T = js.native
  def argMax[T <: Tensor](axis: Double = ???): T = js.native
  def cast[T <: this.type](dtype: DataType): T = js.native
  def add[T <: Tensor](x: Tensor): T = js.native
  def addStrict[T <: this.type](`this`: T, x: T): T = js.native
  def sub[T <: Tensor](x: Tensor): T = js.native
  def subStrict[T <: this.type](`this`: T, x: T): T = js.native
  def pow[T <: Tensor](`this`: T, exp: Tensor): T = js.native
  def powStrict(exp: Tensor): Tensor[R] = js.native
  def mul[T <: Tensor](x: Tensor): T = js.native
  def mulStrict[T <: this.type](`this`: T, x: T): T = js.native
  def div[T <: Tensor](x: Tensor): T = js.native
  def divStrict[T <: this.type](`this`: T, x: T): T = js.native
  def minimum[T <: Tensor](x: Tensor): T = js.native
  def minimumStrict[T <: this.type](`this`: T, x: T): T = js.native
  def maximum[T <: Tensor](x: Tensor): T = js.native
  def maximumStrict[T <: this.type](`this`: T, x: T): T = js.native
  def mod[T <: Tensor](x: Tensor): T = js.native
  def modStrict[T <: this.type](`this`: T, x: T): T = js.native
  def squaredDifference[T <: Tensor](x: Tensor): T = js.native
  def squaredDifferenceStrict[T <: this.type](`this`: T, x: T): T = js.native
  def transpose[T <: Tensor](`this`: T, perm: js.Array[Double] = ???): T = js.native
  def notEqual[T <: Tensor](x: Tensor): T = js.native
  def notEqualStrict[T <: this.type](`this`: T, x: T): T = js.native
  def less[T <: Tensor](x: Tensor): T = js.native
  def lessStrict[T <: this.type](`this`: T, x: T): T = js.native
  def equal[T <: Tensor](x: Tensor): T = js.native
  def equalStrict[T <: this.type](`this`: T, x: T): T = js.native
  def lessEqual[T <: Tensor](x: Tensor): T = js.native
  def lessEqualStrict[T <: this.type](`this`: T, x: T): T = js.native
  def greater[T <: Tensor](x: Tensor): T = js.native
  def greaterStrict[T <: this.type](`this`: T, x: T): T = js.native
  def greaterEqual[T <: Tensor](x: Tensor): T = js.native
  def greaterEqualStrict[T <: this.type](`this`: T, x: T): T = js.native
  def logicalAnd(x: Tensor): Tensor = js.native
  def logicalOr(x: Tensor): Tensor = js.native
  def logicalNot[T <: Tensor](`this`: T): T = js.native
  def logicalXor(x: Tensor): Tensor = js.native
  def where(condition: Tensor, x: Tensor): Tensor = js.native
  def neg[T <: Tensor](`this`: T): T = js.native
  def ceil[T <: Tensor](`this`: T): T = js.native
  def floor[T <: Tensor](`this`: T): T = js.native
  def sign[T <: Tensor](`this`: T): T = js.native
  def exp[T <: Tensor](`this`: T): T = js.native
  def expm1[T <: Tensor](`this`: T): T = js.native
  def log[T <: Tensor](`this`: T): T = js.native
  def log1p[T <: Tensor](`this`: T): T = js.native
  def sqrt[T <: Tensor](`this`: T): T = js.native
  def rsqrt[T <: Tensor](`this`: T): T = js.native
  def square[T <: Tensor](`this`: T): T = js.native
  def reciprocal[T <: Tensor](`this`: T): T = js.native
  def abs[T <: Tensor](`this`: T): T = js.native
  def clipByValue(min: Double, max: Double): Tensor[R] = js.native
  def relu[T <: Tensor](`this`: T): T = js.native
  def elu[T <: Tensor](`this`: T): T = js.native
  def selu[T <: Tensor](`this`: T): T = js.native
  def leakyRelu(alpha: Double = ???): Tensor[R] = js.native
  def prelu(alpha: Tensor[R]): Tensor[R] = js.native
  def sigmoid[T <: Tensor](`this`: T): T = js.native
  def logSigmoid[T <: Tensor](`this`: T): T = js.native
  def softplus[T <: Tensor](`this`: T): T = js.native
  def sin[T <: Tensor](`this`: T): T = js.native
  def cos[T <: Tensor](`this`: T): T = js.native
  def tan[T <: Tensor](`this`: T): T = js.native
  def asin[T <: Tensor](`this`: T): T = js.native
  def acos[T <: Tensor](`this`: T): T = js.native
  def atan[T <: Tensor](`this`: T): T = js.native
  def sinh[T <: Tensor](`this`: T): T = js.native
  def cosh[T <: Tensor](`this`: T): T = js.native
  def tanh[T <: Tensor](`this`: T): T = js.native
  def asinh[T <: Tensor](`this`: T): T = js.native
  def acosh[T <: Tensor](`this`: T): T = js.native
  def atanh[T <: Tensor](`this`: T): T = js.native
  def erf[T <: Tensor](`this`: T): T = js.native
  def round[T <: Tensor](`this`: T): T = js.native
  def step[T <: Tensor](`this`: T, alpha: Double = ???): T = js.native
  def softmax[T <: this.type](`this`: T, dim: Double = ???): T = js.native
  def resizeBilinear[T <: Tensor3D | Tensor4D](`this`: T, newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean = ???): T = js.native
  def resizeNearestNeighbor[T <: Tensor3D | Tensor4D](`this`: T, newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean = ???): T = js.native
  def conv1d[T <: Tensor2D | Tensor3D](`this`: T, filter: Tensor3D, stride: Double, pad: String | Double, dataFormat: String = ???, dilation: Double = ???, dimRoundingMode: String = ???): T = js.native
  def conv2d[T <: Tensor3D | Tensor4D](`this`: T, filter: Tensor4D, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dataFormat: String = ???, dilations: js.Tuple2[Double, Double] | Double = ???, dimRoundingMode: String = ???): T = js.native
  def conv2dTranspose[T <: Tensor3D | Tensor4D](`this`: T, filter: Tensor4D, outputShape: js.Tuple4[Double, Double, Double, Double] | js.Tuple3[Double, Double, Double], strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): T = js.native
  def depthwiseConv2D[T <: Tensor3D | Tensor4D](`this`: T, filter: Tensor4D, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dataFormat: String = ???, dilations: js.Tuple2[Double, Double] | Double = ???, dimRoundingMode: String = ???): T = js.native
  def avgPool[T <: Tensor3D | Tensor4D](`this`: T, filterSize: js.Tuple2[Double, Double] | Double, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): T = js.native
  def maxPool[T <: Tensor3D | Tensor4D](`this`: T, filterSize: js.Tuple2[Double, Double] | Double, strides: js.Tuple2[Double, Double] | Double, pad: String | Double, dimRoundingMode: String = ???): T = js.native
  def localResponseNormalization[T <: Tensor3D | Tensor4D](`this`: T, radius: Double = ???, bias: Double = ???, alpha: Double = ???, beta: Double = ???): T = js.native
  def variable(trainable: Boolean = ???, name: String = ???, dtype: DataType = ???): Variable[R] = js.native
  def unsortedSegmentSum[T <: Tensor](`this`: T, segmentIds: Tensor1D, numSegments: Double, axis: Double = ???): T = js.native
}

@js.native
@JSGlobal
object Tensor extends js.Object {
  def make[T <: Tensor[R], D <: DataType, R <: Rank](shape: js.Any, data: TensorData, dtype: D = ???): T = js.native
}

@js.native
@JSGlobal
class Variable[R <: Rank] extends Tensor[R] {
  var trainable: Boolean = js.native
  var name: String = js.native
  def assign(newValue: Tensor[R]): Unit = js.native
}

@js.native
@JSGlobal
object Variable extends js.Object {
  def variable[R <: Rank](initialValue: Tensor[R], trainable: Boolean = ???, name: String = ???, dtype: DataType = ???): Variable[R] = js.native
}

@js.native
@JSGlobalScope
object Tensor extends js.Object {
  type DataId = js.Object
  type Scalar = Tensor[Rank.R0]
  type Tensor1D = Tensor[Rank.R1]
  type Tensor2D = Tensor[Rank.R2]
  type Tensor3D = Tensor[Rank.R3]
  type Tensor4D = Tensor[Rank.R4]
  val variable: Variable.variable.type = js.native
}

}
