public class PalindromString
{
    public static void main(String args[])
    {


        String str = "kayak";

        String rev = "";

        char [] chArr = str.toCharArray();

        for(int i=0;i<chArr.length;i++)
        {
            rev = chArr[i] + rev;
        }

        System.out.println(str);
        System.out.println(rev);

        if(str.equals(rev))
        {
            System.out.println("String is Palindrom");
        }
        else
        {
            System.out.println("String is not Palindrom");
        }


    }

}
