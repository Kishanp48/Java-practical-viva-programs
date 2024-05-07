class TryCatchFinally
{
    public static void main(String args[])
    {
        int a=2, b=0;

        try
        {
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println("can't divide by ZERO");
        }
        finally
        {
            System.out.println("must print, finally!!");
        }


    }
}