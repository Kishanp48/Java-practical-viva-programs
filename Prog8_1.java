class MyThread extends Thread
{
    public void run()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println(i);
                try
                {
                Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    
                }

        }
    }
}


public class Prog8_1
{


    public static void main(String[] args) {
        

        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        m1.start();
        m2.start();
    


    }
    
}
