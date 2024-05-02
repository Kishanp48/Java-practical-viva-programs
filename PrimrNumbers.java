import java.util.Scanner;

public class PrimrNumbers
{

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int nTh = sc.nextInt();

        sc.close();
        // int nTh = 20;


        for(int n = 1 ; n<=nTh ; n++)
        {
            int count = 0;

            for(int i = 2 ; i<=n ; i++)
            {

                if(n%i==0)
                {
                    count++;
                }

                
            }

            if(!(count > 1))
            {
                System.out.println(n);
            }
            
            count = 0;

        }

    }
}
