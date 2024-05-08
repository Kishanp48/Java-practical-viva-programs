class MyThread implements Runnable
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


public class Prog8_2 {

    public static void main(String[] args) {
        

        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();






    }
    
}
