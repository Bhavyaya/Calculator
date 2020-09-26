package mooc.vandy.java4android.calculator.logic;

/*
 * Perform the Divide operation.
*/
public class Divide extends Operate{
    // TODO -- start your code here

    //Operands
    private static int dividend = 0;
    private static int divisor = 1;

    //Constructor taking the operands as input and
    //Setting values through setter functions
    public Divide(int numOne, int numTwo) {
        setDividend(numOne);
        setDivisor(numTwo);
    }

    //Setting values of dividend and divisor
    private void setDividend(int numOne){
        dividend = numOne;
    }
    private void setDivisor(int numTwo){
        divisor = numTwo;
    }

    //Perform division to find quotient and remainder and return it in string format
    public static String operate() {

        //Giving error feedback for division by zero
        if(divisor == 0) return("Division by zero is un-defined");

        //Storing results using % and / operators
        int modulus = dividend % divisor;
        int divide = dividend / divisor;

        /*
          The operators / and % when used directly won't always give correct quotients and remainders.
          So they have to be modified.
          dividend = (divisor × quotient) + remainder
          And 0 <= remainder < divisor
        */

        //Variables to store quotient and remainder
        int quotient;
        int remainder;

        //When either Dividend is positive or the two numbers are divisible(remainder on division = 0)
        if(dividend > 0 || modulus == 0)
        {
            //In this case / and % operators will give correct outputs
            quotient = divide;
            remainder = modulus;
            /*
            Dividend = 7, Divisor = 2
            Quotient = 3 and Remainder = 1
            7 = 3*2 + 1

            Dividend = 7, Divisor = -2
            Quotient = -3 and Remainder = 1
            7 = -3*(-2) + 1

            Dividend = -5, Divisor = 5
            Quotient = -1 and Remainder = 0
            -5 = 5 * (-1) + 0
            */
        }
        //dividend is negative while divisor is positive and are not exactly divisible(i.e. dividend is not a multiple of divisor)
        else if(dividend < 0 && divisor > 0)
        {
            //quotient and remainder have to be updated
            quotient = divide - 1;
            remainder = modulus + divisor;
           /*
            E.g. Dividend = -7, Divisor = 2
            Quotient = -4 and Remainder = 1
            7 = -4*2 + 1
           */
        }
        //When dividend and divisor both are negative and not exactly divisible(i.e. dividend is not a multiple of divisor)
        else
        {
            quotient = divide + 1;
            remainder = modulus - divisor;
            /*
                Dividend = -7, Divisor = -2
                Quotient = 4 and Remainder = 1
                -7 = 4*(-2) + 1
            */
        }
        return(quotient + " R: " + remainder);
    }
}