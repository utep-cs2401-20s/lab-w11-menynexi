import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

public class newSortingTester{

    //This test case was created to test if the populateArray worked correctly im taking a bottom up approach it was used to create the building's



    //this is used to test if mergeSortedHalves works when all the values are lower in LH first
    /*@Test
    public void T1mergeSortedHalves(){
        int[] arr = {1,3,4,5};
        int[] LH = {1,3};
        int[] RH = {4,5};
        int[] exp = {1, 3, 4, 5};

        newSorting.mergeSortedHalves(arr, LH, RH);
        assertArrayEquals(exp, arr);
    }

    //this is used to test if mergeSortedHalves works when all the values are lower in RH first
    @Test
    public void T2mergeSortedHalves(){
        int[] arr = {5,4,1,3};
        int[] LH = {4,5};
        int[] RH = {1,3};
        int[] exp = {1, 3, 4, 5};

        newSorting.mergeSortedHalves(arr, LH, RH);
        assertArrayEquals(exp, arr);
    }

    //this test was used when alternating values need to be implemented
    @Test
    public void T3mergeSortedHalves(){
        int[] arr = {1,3,2,4};
        int[] LH = {1,3};
        int[] RH = {2,4};
        int[] exp = {1, 2, 3, 4};

        newSorting.mergeSortedHalves(arr, LH, RH);
        assertArrayEquals(exp, arr);
    }

    //the following test cases are to test quickstoer method
    @Test
    public void T4quicksort(){
        int[] arr = {1, 3, 2, 4};
        int[] exp = {1, 2, 3, 4};

        newSorting.toQuicksort(arr, 0, arr.length - 1);//arr.length -1 because it will
        assertArrayEquals(exp, arr);
    }*/

    //these cases where used to test the whole method new sorting

    @Test// this is testing when the array is smaller than the size given it should only make a single call to quicksort
    public void T5newSorting(){
        int[] arr = {1, 3, 2, 4};
        int[] exp = {1, 2, 3, 4};

        newSorting n = new newSorting();
        n.newSorting(arr, 5);
        assertArrayEquals(exp, arr);
    }

    @Test // I used this test case because when debugging my code I found out that RH was not populating correctly
    // and it would populate RH with zeros this test case was used to test how RH was being populating
    public void T6newSorting(){
        int[] arr = {1, 3, 0, 0};
        int[] exp = {0, 0, 1, 3};

        newSorting n = new newSorting();
        n.newSorting(arr, 4);
        assertArrayEquals(exp, arr);
    }

    @Test//this is testing when the array is bigger than the size given it should populate RH and LH correctly
         // then make recursive calls that break down RH and LH till the size allows them to do a quick sort and merge them together
    public void T7newSorting(){
        int[] arr = {1, 3, 2, 4, 7};
        int[] exp = {1, 2, 3, 4, 7};

        newSorting n = new newSorting();
        n.newSorting(arr, 3);
        assertArrayEquals(exp, arr);
    }

    @Test//this was used to test a larger number set and check if it still have problems with populateing RH correctly
    public void T8newSorting(){
        int[] arr = {3, 8, 9, 7, 5, 4, 13};
        int[] exp = {3, 4, 5, 7, 8, 9, 13};

        newSorting n = new newSorting();
        n.newSorting(arr, 3);
        assertArrayEquals(exp, arr);
    }

    @Test// while testing size -1 I found out that it creates a stack overflow and went back and fixed it by implementing an if statement
    public void T9newSorting(){
        int[] arr = {12, 7, 5, 4, 22};
        int[] exp = {4, 5, 7, 12, 22};

        newSorting n = new newSorting();
        n.newSorting(arr, -1);
        assertArrayEquals(exp, arr);
    }

    @Test// I used this test case because I wanted to test the effect of implementation if it was given a negative integer would it compute properly
    public void T10newSorting(){
        int[] arr = {12, -7, 5, -4, 22};
        int[] exp = {-7, -4, 5, 12, 22};

        newSorting n = new newSorting();
        n.newSorting(arr, 3);
        assertArrayEquals(exp, arr);
    }




}