object SquareRoot {
  def MathAbs(number: Double): Double = {
    if (number < 0.0) -1 * number;
    else number;
  }
/*
* Learnt nested scoping and reusing outer variables to save
* copies of variables created (in the previous impoementation)
* This is awesome.
*
* */
  def getSquareRootOfNumber(number: Double) = {

    def squareRootIterative(initial: Double, number: Double): Double = {
      if (number == 0) number
      if (initial == 0) -1;
      if (correctResult(initial)) {
        initial;
      }
      else {
        squareRootIterative(improve(initial), number);

      }
    }

    def improve(initial: Double): Double = {

      if (initial == 0) -1
      (initial + number / initial) / 2;


    }

    def correctResult(initial: Double): Boolean = {


      if (MathAbs(initial * initial - number) <= 0.01) true;
      else false


    }


    squareRootIterative(1, number);

  }


  getSquareRootOfNumber(11);

}

