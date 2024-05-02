abstract class A
{
    abstract void show();

    void display()
    {
        System.out.println("in display");
    }
}


public class AbstractClassProg extends A
{

    @Override
    void show()
    {
        System.out.println("in show");
    }



    public static void main(String args[])
    {

        AbstractClassProg obj = new AbstractClassProg();

        obj.show();

        obj.display();



    }
    
}
