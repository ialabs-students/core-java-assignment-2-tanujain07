import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    // creating method as arrayListSortDesc!
    public static ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> array) {
        // Using collection class with sort method in reverse order to match the output!
        Collections.sort(array, Collections.reverseOrder());
        return array;
    }

    public static void main(String[] args) {
        // Creating an arraylist of type Big Integer
        ArrayList<BigInteger> array = new ArrayList<BigInteger>();
        // Adding the values in the array list
        array.add(new BigInteger("24"));
        array.add(new BigInteger("543534"));
        array.add(new BigInteger("545"));
        array.add(new BigInteger("2342"));
        array.add(new BigInteger("9"));

        // Calling the method
        System.out.println(arrayListSortDesc(array));
    }
}
