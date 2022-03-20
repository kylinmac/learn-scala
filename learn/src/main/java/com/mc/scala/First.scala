/**
 * @author macheng
 * @date 2022/2/21 21:02
 */

/**
 * 函数皆值，值皆对象
 *
 * @object 静态，单例
 */
object Test {
  /**
   * @裸露代码 默认构造
   */
  /**
   * 常量 final
    */
  val a=1
  /**
   * 变量
   */
  var b="1"
  private var name="name"
  //指定类型
  var test:Test=new Test("b")
  println("object construct")

  def main(args: Array[String]): Unit = {
    println("hello")
    test.printMsg(10)
  }

}

/**
 * 类名构造器，默认val,private，使用类名构造器后，无参构造器被取代
 * 只有类名构造器中的参数可定义为var，其他方法函数中的参数都是val类型，不可设置为var
 * @param c
 * @param d
 */
class Test(var c:Int,d:String) {
  val a=2
  var  b="2"

  /**
   * 必须调用默认构造
   * @param b
   */
  def this(b:String){
    this(1,"2")
    this.b=b
  }
  println("class construct")

  /**
   * Unit类似void
   * 方法入参必须指定类型
   * @param x
   */
  def printMsg(x:Int): Unit ={
    println(s"a$a")
    println(s"a${a+1}")
    println(s"${Test.a}")
    //同名伴生类可访问私有属性
    println(s"${Test.name}")
    println(b)
    println(x)
  }
}

class Test2{
  def printMsg(): String ={
   // return Test.name 会报错
    return Test.b
  }
}
