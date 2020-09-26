package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operate{
    // TODO -- start your code here

    //Operands
    private static int multiplier = 0;
    private static int multiplicand  = 0;

    //Constructor taking the operands as input and
    //Setting values through setter functions
    public Multiply(int numOne, int numTwo) {
        setMultiplier(numOne);
        setMultiplicand(numTwo);
    }

    //Setting values of multiplier and multiplicand
    private static void setMultiplier(int numOne) {
        multiplier = numOne;
    }
    private static void setMultiplicand(int numTwo) {
        multiplicand = numTwo;
    }

    //Perform multiplcation and return product in string format
    public static String operate() {
        return(Integer.toString(multiplier * multiplicand));
    }
}

