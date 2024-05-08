class Demo
{
    int id=0;
    String name="try";

    Demo()
    {
        System.out.println(id+","+name);
    }

    Demo(int id, String name)
    {
        this.id = id;
        this.name = name;

        System.out.println(this.id+","+this.name);

    }

    Demo(Demo obj)
    {
        System.out.println(obj.id+","+obj.name);
    }

}


public class Prog4_3
{

    public static void main(String[] args)
    {
        
        Demo d1 = new Demo();
        Demo d2 = new Demo(24,"Hello");
        Demo d3 = new Demo(d2);
        

    }
    
}
