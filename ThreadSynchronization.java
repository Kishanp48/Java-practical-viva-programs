class Table
{
    synchronized void printTable(int n)
    {

        for(int i = 1; i<=10;i++)
        {
            System.out.printf("%2d x %2d = %2d\n", n, i, n*i);
        }
    }
}



class Thread1 extends Thread
{
    Table t;

    Thread1(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(2);
    }

}


class Thread2 extends Thread
{
    Table t;

    Thread2(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(5);
    }

}


public class ThreadSynchronization
{
    public static void main(String args[])
    {

       Table obj = new Table();

       Thread1 t1 = new Thread1(obj);
       Thread2 t2 = new Thread2(obj);

       t1.start();
       t2.start();

    }
    
}