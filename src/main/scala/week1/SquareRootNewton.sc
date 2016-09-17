object SquareRoot {


  def squareRootIterative(initial: Double, number: Int): Double = {
    if (number == 0) return number
    if (initial == 0) return -1;
    if (correctResult(initial, number)) {
      initial;
    }
    else {
      squareRootIterative(improve(initial, number), number);

    }
  }

  def improve(initial: Double, number: Int): Double = {

    if (initial == 0) return -1
    (initial + number / initial) / 2;


  }

  def correctResult(initial: Double, number: Int): Boolean = {


    if (MathAbs(initial * initial - number) <= 0.001) true;
    else false


  }

  def MathAbs(number: Double): Double = {
    if (number < 0.0) -1 * number;
    else number;
  }


  def getSquareRootOfNumber(number: Int) = {


    squareRootIterative(1, number);

  }


  getSquareRootOfNumber(2);
}

