public class Prog9_2 {


    public void show(int i) throws IllegalArgumentException
    {
    
        if(i<10)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            System.out.println(i);
        }
    }

    


    public static void main(String[] args)
    {
        
    
        new Prog9_2().show(1);


    }
    
}
