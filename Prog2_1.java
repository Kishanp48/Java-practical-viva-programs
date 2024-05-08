public class Prog2_1 {

    public static void main(String[] args) {
        

        int a=2, b=3, temp;

        System.out.printf("a=%d & b=%d\n",a,b);

        // temp = a;
        // a = b;
        // b = temp;

        
        a= a+b;
        b=a-b;
        a=a-b;

        System.out.printf("a=%d & b=%d",a,b);


    }
    


}
