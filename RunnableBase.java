public class RunnableBase implements Runnable
{
    public void run()
    {
        System.out.println("hello");
    }


    public static void main(String args[])
    {
        RunnableBase obj = new RunnableBase();

        Thread t = new Thread(obj);

        t.start();

    }
    
}
