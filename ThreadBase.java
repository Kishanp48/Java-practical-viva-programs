public class ThreadBase extends Thread
{
    public void run()
    {
        System.out.println("hello");
    }
    
    public static void main(String args[])    
    {

        ThreadBase tb = new ThreadBase();

        tb.start();
        
    }
}
