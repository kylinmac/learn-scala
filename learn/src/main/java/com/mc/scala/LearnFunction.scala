import java.util.Date

/**
 * @author macheng
 * @date 2022/2/24 21:12
 */
object LearnFunction {

  def main(args: Array[String]): Unit = {

    def fun01(): Unit = {
      println("hello world")
    }

    val y = fun01()
    println(y)

    def fun02(): Int = {
      3
    }

    println(fun02())

    //和2.0.11好像不一样？
    def fun03() {
      return 3
    }

    println(fun03())


    //递归
    def fun04(num: Int): Int = {
      if (num == 1) {
        num
      } else {
        num * fun04(num - 1)
      }
    }

    println(fun04(4))

    //默认值函数
    def fun05(a: Int = 8, b: String = "abc"): Unit = {
      println(s"$a\t$b")
    }

    fun05()
    fun05(b = "b")

    //匿名函数
    //函数是第一类值
    var x = (a: Int, b: Int) => {
      a + b
    }
    //签名
    var xx: (Int, Int) => Int = (a: Int, b: Int) => {
      a + b
    }
    val w = x(3, 4)
    println(w)


    //嵌套函数
    def fun06(a: String): Unit = {
      def fun05(): Unit = {
        println(a)
      }

      fun05()
    }

    fun06("a")

    //偏应用函数
    def fun07(date: Date, tp: String, msg: String): Unit = {
      println(s"$date:$tp:$msg")
    }

    fun07(new Date, "info", "ok")

    var info = fun07(_: Date, tp = "info", _: String)

    info(new Date, "ok")

    //可变参数
    def fun08(a: Int*): Unit = {
      // def foreach(intToUnit: Int => Unit)
      a.foreach((x: Int) => println(x))
      a.foreach(() -> println(_))
      a.foreach(println(_))
      a.foreach(println)
    }

    fun08(1, 2, 3)


    //高阶函数
    //函数作为入参
    def computer(a: Int, b: Int, f: (Int, Int) => Int): Unit = {
      val res = f(a, b)
      println(res)
    }

    computer(2, 3, (x, y) => x + y)
    computer(2, 3, _ + _)

    //函数作为返回值

    def factory(i: String): (Int, Int) => Int = {

      def plus(x: Int, y: Int): Int = {
        x + y
      }

      def minus(x: Int, y: Int): Int = {
        x - y
      }

      if ("+".equals(i)) {
        plus
      } else {
        minus
      }

    }
    computer(2,3,factory("+"))
    //柯里化

    def fun10(a:Any*): Unit ={
    }

    def fun09(a:Int*)(b:Int*)(c:String): Unit ={
    }
    fun09(1,2,3)(2,3,4)("")
    //赋值 而不是执行方法 咋用？？？
    val func = fun09 _

    //一切皆对象
    println(4.+(2))
  }

}
