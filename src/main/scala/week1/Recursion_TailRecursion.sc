/*
*
* Euclid's Algorithm --> GCD (a,b )=
*
* if b is 0 then a else gcd (b, a%b)
*
*
* */


//object withoutTailRecursion {
//
//
//  def gcd(a: Int, b: Int): Int = {
//
//    if (b == 0) a else gcd(b, a % b)
//
//
//  }
//
//  def factorial(number: Long): Long = {
//    if (number == 1) return 1;
//
//    number * factorial(number - 1)
//  }
//
//  gcd(10, 20);
//  factorial(6);
//
//}

object TailRecurive {

  /*
  * http://c2.com/cgi/wiki?TailRecursion
  * */
  def factorial(number: Long, accumalator: Long): Long = {

    if (number == 0) {

       accumalator
    }
    else {
      //      accumalator = accumalator * number;
      //n--;

       factorial(number - 1, accumalator * number);

    }


  }

  factorial(6, 1);


}
