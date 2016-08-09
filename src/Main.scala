/**
  * Created by ivarha on 04.08.2016.
  */
object Main {

  def main(args: Array[String]): Unit = {

    val f = true
    var v = if (!f) 1 else ()
    printf("HELLO" + v)
    for (i<- 1 to 10 ) printf(i+ "")
  }
}
