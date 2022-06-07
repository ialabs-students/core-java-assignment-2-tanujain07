import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
   
    public static ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> array) {
       
        Collections.sort(array, Collections.reverseOrder());
        return array;
    }

    public static void main(String[] args) {
       
        ArrayList<BigInteger> NewArray = new ArrayList<BigInteger>();
      
        NewArray.add(new BigInteger("24"));
        NewArray.add(new BigInteger("543534"));
        NewArray.add(new BigInteger("545"));
        NewArray.add(new BigInteger("2342"));
        NewArray.add(new BigInteger("9"));

        
        System.out.println(arrayListSortDesc(NewArray));
    }
}
