public class ArraySumAverage
{
    public static void main(String args[])    
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum=0;

        for(int i = 0;i<arr.length;i++)
        {

            sum +=arr[i];

        }

        float avg = sum/arr.length;

        System.out.printf("array is sum is %d and Average is %.2f", sum, avg);

        
    }
}
