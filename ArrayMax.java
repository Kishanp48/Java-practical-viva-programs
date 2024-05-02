public class ArrayMax
{
    
    public static void main(String args[])
    {

        int[] arr = {34, 67, 23, 5, 43, 78, 3};

        int max = arr[0];

        for(int i = 1 ;i<arr.length ; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        

        System.out.println("Max value is "+max);


    }

}
