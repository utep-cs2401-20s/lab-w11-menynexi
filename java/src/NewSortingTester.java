import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

public class NewSortingTester{

    //This test case was created to test if the populateArray worked correctly im taking a bottom up approach

    //this test case was created to test if the array can be populated
    @Test
    public void test1(){
        int[] arr = {7, 8, 6, 9, 3};
        int[] LH = new int[arr.length];

        NewSorting.populateArray(arr, LH, 0,arr.length);
        assertArrayEquals(LH, arr);
    }



}