public class PalindromString
{

    /**
     * @param args
     */
    public static void main(String args[])
    {


        StringBuffer s = new StringBuffer("kayak");

        StringBuffer str = new StringBuffer(s);
        
        StringBuffer rev = new StringBuffer(s.reverse());


        System.out.println(str);
        System.out.println(rev);



        if(str.equals(rev))
        {
            System.out.println("String is palindrom");
        }
        else
        {

            System.out.println("String is not palindrom");
        }
    }

}
