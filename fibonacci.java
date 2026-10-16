import java.util.Scanner;
public class fibonacci {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a=0,b=1,c,n=2;
        char k;
        System.out.print("Enter 'a' for Fibonacci series OR Enter 'b' for Sum of Digits af all Numbers.");
        k=in.next().charAt(0);
        switch (k) {
            case 'a':
                System.out.print(a+", "+b+", ");
                for(;n<=10;n++)
                {
                    c=a+b;
                    System.out.print(c+", ");
                    a=b;
                    b=c;
                }
                break;

            case 'b':
                System.out.print("Enter the number:");
                n=in.nextInt();
                for(c=n;c>0;c/=10)
                {
                    b=c%10;
                    a=a+b;
                }
                System.out.println("The Sum of all digits of "+n+"="+a);
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
        
    }
}
