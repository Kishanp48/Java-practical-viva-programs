public class ThreadJoin extends Thread
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

    public static void main(String[] args) 
    {
        ThreadJoin obj1 = new ThreadJoin();
        ThreadJoin obj2 = new ThreadJoin();
        ThreadJoin obj3 = new ThreadJoin();


        obj1.setName("T-1");
        obj2.setName("T-2");
        obj3.setName("T-3");

        obj2.start();

        try
        {
            obj2.join();
            
            obj1.start();
            obj3.start();
        }
        catch(Exception e)
        {
            obj1.start();
            obj3.start();
        }

    }
    
}
