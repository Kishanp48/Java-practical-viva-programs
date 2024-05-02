class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}


public class UserDefineException
{
    public static void main(String[] args)
    {
    
        try
        {
            throw new MyException("null");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
    }    
}
