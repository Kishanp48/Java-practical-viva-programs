public class Prog5_1 {

    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5};
        
        int arr[][] = {{1,2,3,4,5}, {6,7,8,9,0}};

        int i, j;

        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("\n\n");

        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
            }
        }

    }
    
}
