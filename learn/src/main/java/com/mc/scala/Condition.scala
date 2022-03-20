
object Condition {


  def main(args: Array[String]): Unit = {
    testFor()
  }

  def testIf(): Unit = {
    var a = 0
    if (a <= 0) {
      println(s"$a<=0")
    } else {
      println(s"$a>0")
    }
  }

  def testWhile(): Unit = {
    var a = 0;
    while (a < 10) {
      println(a)
      a += 1
    }
  }

  def testFor(): Unit = {
    //12345678910
    val seq: Range.Inclusive = 1 to 10
//    seq.foreach(print(_))
    //13579
    val stepSeq = 1 to(10, 2)
    //123456789
    val range = 1 until 10

    //13579
    val rangeStep = 1 until(10, 2)

    for (i <- seq) {
    //  println(i)
    }
    //守护
    for (i <- seq if (i % 2 == 0)) {
    //  println(i)
    }

    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        if (j <= i) print(s"$i * $j = ${i * j}\t")
        if (j == i) println()
      }
    }

    for(i<- 1 to 9;j <- 1 to i){
      if (j <= i) print(s"$i * $j = ${i * j}\t")
      if (j == i) println()
    }

    val ints= for (i <- 1 to 10) yield {
      i + 10
    }
    println(ints.getClass)
  }
}

class Condition {

}