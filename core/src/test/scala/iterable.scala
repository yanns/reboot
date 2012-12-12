package dispatch.spec
/*
import org.scalacheck._

object IterablePromiseSpecification
extends Properties("Iterable Promise")
with DispatchCleanup {
  import Prop._
  import Gen._

  val server = { 
    import unfiltered.netty
    import unfiltered.response._
    import unfiltered.request._
    object Str extends Params.Extract("str", Params.first)
    object Chr extends Params.Extract("chr", Params.first ~> {
      _.flatMap{ _.toList.headOption } } )
    netty.Http.anylocal.handler(netty.cycle.Planify {
      case Path("/split") & Params(Str(str)) =>
        PlainTextContent ~> ResponseString(str.mkString("",",",","))
      case Path("/value") & Params(Chr(chr)) =>
        PlainTextContent ~> ResponseString(chr.toInt.toString)
    }).start()
  }

  import dispatch._

  def localhost = host("127.0.0.1", server.port)

  def split(str: String): Future[Seq[String]] =
    for (csv <- Http(localhost / "split" << Seq("str" -> str) > as.String))
      yield csv.split(",")

  def value(str: String): Future[Int] =
    for (v <- Http(localhost / "value" << Seq("chr" -> str) > as.String))
      yield v.toInt

  property("iterable promise guarantor") = forAll(Gen.alphaStr) {
  (sample: String) =>
    val values: Future[Iterable[Int]] = for {
      chrs <- split(sample)
      chr <- chrs
    } yield value(chr)
    values() == sample.map { _.toInt }
  }

  property("iterable promise values") = forAll(Gen.alphaStr) {
  (sampleL: String) =>
    val sample = sampleL.take(10) // n^2 concurrent requests
    val values: Future[Iterable[(Int,Int)]] = for {
      chr1 <- split(sample).values.flatten
      chr2 <- split(sample.reverse).values
      c1 <- value(chr1)
      c2 <- value(chr2)
    } yield (c1, c2)
    values() =? (for {
      c1 <- sample
      c2 <- sample.reverse
    } yield (c1.toInt, c2.toInt))
  }

  property("iterable promise values on either") = forAll(Gen.alphaStr) {
  (sampleL: String) =>
    val sample = sampleL.take(10) // n^2 concurrent requests
    val values: Future[Either[Throwable,Iterable[Int]]] = for {
      chr1 <- split(sample).either.right.values
      c1 <- value(chr1)
    } yield Right(c1)
    values().right.get =? (for {
      c1 <- sample
    } yield c1.toInt)
  }

}
*/

