class Factorial
{
    public static void main(String args[])
    {

        int fact = 1;
        int num = 5;

        for(int i = 1; i<=num ;i++)
        {
            fact *= i;
        }

        System.out.printf("Factorial of %d is %d", num, fact);

    }
}