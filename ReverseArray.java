// public class ReverseArray {
//     public static void main(String[] args) {

        
//         int arr[] = {1,2,3,4,5};

//         for(int i = arr.length-1 ; i>=0 ; i--)
//         {
//             System.out.println(arr[i]);
//         }

//     }
// }





import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 10};  // Use Integer array for primitives

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(Arrays.toString(numbers));  // Output: [10, 8, 5, 2, 1]
    }
}
