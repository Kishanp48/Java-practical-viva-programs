class A
{
    A()
    {
        System.out.println("hello");
    }

    A(int a, int b)
    {
        System.out.println(a+b);
    }

}

class Constructors
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        A obj2 = new A(2,3);



        
    }

}