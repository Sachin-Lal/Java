import java.util.Scanner;
public class digit
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=in.nextInt();
        System.out.println("The Digits are:");
        while(n!=0)
        {
            System.out.print((n%10)+",");
            n=n/10;
        }
        
    }
}