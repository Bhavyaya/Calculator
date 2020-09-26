package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operate{
    // TODO -- start your code here

    //Operands
    private static int addend = 0;
    private static int augend  = 0;

    //Constructor taking the operands as input and
    //Setting values through setter functions
    public Add(int numOne, int numTwo) {
        setAddend(numOne);
        setAugend(numTwo);
    }

    //Setting values of addend and augend
    private static void setAddend(int numOne) {
        addend = numOne;
    }
    private static void setAugend(int numTwo) {
        augend = numTwo;
    }

    //Perform addition and return sum in string format
    public static String operate() {
        return(Integer.toString(addend + augend));
    }
}
