import java.util.Arrays;
import java.util.Collections;

public class Arrays_methods {

    public static void main(String[] args) {
        


        // Arrays.fill();
        // Arrays.sort();
        // Arrays.equals();
        // Arrays.binarySearch();


        // Collections.reverse(arr);



        int arr[] = {1,2,3,4,5};

        Arrays.fill(arr, 1, 3, 8);
        System.out.println(Arrays.toString(arr));


        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));







        int arr0[] = {1,2,3,4,5};
        
        System.out.println(Arrays.binarySearch(arr0, 2));



        
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        int arr3[] = {1,2,3};
        

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));



        Integer b[] = {23,56,23,2,24,7};

        // Arrays.sort(b);
        // System.out.println(Arrays.toString(b));



        Arrays.sort(b, Collections.reverseOrder());
        
        System.out.println(Arrays.toString(b));


    }
    
}
