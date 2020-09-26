package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation){

        // TODO -- start your code here
        //A base class Operate has been made which acts as an interface
        //The method operate() is inherited by all the 4 operation classes

        /*
        Creating objects for each class and
        Passing arguments through constructors.
         */
        Add sum = new Add(argumentOne, argumentTwo);
        Subtract difference = new Subtract(argumentOne, argumentTwo);
        Multiply product = new Multiply(argumentOne, argumentTwo);
        Divide division = new Divide(argumentOne, argumentTwo);

        //Printing outputs by checking the type of operation and making function calls to perform the required operation.
        //Method operate is inherited the classes and is called using appropriate objects depending upon the type of operation.

        if(operation == 1) mOut.print(sum.operate());
        else if(operation == 2) mOut.print(difference.operate());
        else if(operation == 3) mOut.print(product.operate());
        else if(operation == 4) mOut.print(division.operate());
        else mOut.print("Invalid Operation");
    }
}
