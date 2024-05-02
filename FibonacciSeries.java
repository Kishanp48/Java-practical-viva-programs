public class FibonacciSeries
{

    public static void main(String[] args)
    {
        int a = 0, b = 1, c=0;

        int no=10;

        while(c<no)
        {
            System.err.println(c);

            a=b;
            b=c;
            c=a+b;

        }

    }
    
}
