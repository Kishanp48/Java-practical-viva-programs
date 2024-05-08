public class ThreadSleep extends Thread
{

    public void run()
    {
        String name = Thread.currentThread().getName();

        try
        {
            for(int i = 0 ; i<5 ; i++)
            {
                System.out.println(name);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {

        }
    }


    public static void main(String args[])    
    {

        ThreadSleep obj1 = new ThreadSleep();
        ThreadSleep obj2 = new ThreadSleep();
        ThreadSleep obj3 = new ThreadSleep();


        obj1.setName("T-1");
        obj2.setName("T-2");
        obj3.setName("T-3");


        obj1.start();
        obj2.start();
        obj3.start();

    }
}
