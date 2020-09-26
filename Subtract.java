package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operate{
    // TODO -- start your code here

    //Operands
    private static int subtrahend = 0;
    private static int minuend  = 0;

    //Constructor taking the operands as input and
    //Setting values through setter functions
    public Subtract(int numOne, int numTwo) {
        setMinuend(numOne);
        setSubtrahend(numTwo);
    }

    //Setting values of minuend and subtrahend
    private static void setMinuend(int numOne) {
        minuend = numOne;
    }
    private static void setSubtrahend(int numTwo) {
        subtrahend = numTwo;
    }

    //Perform subtraction and return difference in string format
    public static String operate() {
        return(Integer.toString(minuend - subtrahend));
    }
}

