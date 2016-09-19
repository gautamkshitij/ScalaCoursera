import scala.collection.mutable.ListBuffer

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    1
  }

  /**
    * Exercise 2
    */


  def balance(chars: List[Char]): Boolean = {


    def loop(stack: ListBuffer[Char], chars: List[Char]): Boolean = {
      //      println();
      //      println();
      //      print("\nStack :" + stack.toString());
      //      print("\nString :" + chars.toString());

      if (chars.isEmpty && stack.isEmpty) {
        //        println();
        //        println("Going: TRUE");
        return true
      }
      else if (chars.isEmpty && !stack.isEmpty) {
        //        println();
        //        println("Going: FALSE");
        return false;
      }

      if (chars.head.equals('(')) {

        stack += '(';
        //        println();
        //        println("inside ( ");
        loop(stack, chars.tail);
      }
      else if (chars.head.equals(')')) {
        //        println();
        //        println("Inside )");
        if (stack.isEmpty) return false;
        loop(stack.tail, chars.tail);
      }
      else {
        //        println();
        loop(stack, chars.tail);
      }


    }


    loop(new ListBuffer[Char], chars);

  }


  balance(":-)".toList);

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {

    1

  }

}
