/*
*
* Euclid's Algorithm --> GCD (a,b )=
*
* if b is 0 then a else gcd (b, a%b)
*
*
* */


object withoutTailRecursion {


  def gcd(a: Int, b: Int): Int = {

    if (b == 0) a else gcd(b, a % b)


  }

  def factorial(number: Long): Int = {
    if (number == 1) return 1;

    number * factorial(number - 1)
  }

  gcd(10, 20);
  factorial(5000);

}

object TailRecurive {


}