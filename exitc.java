import java.util.Scanner;
public class exitc
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter 0 to stop program or not to print congrats");
        int n = ob.nextInt();
        if(n==0)
        {
            System.out.println("Oops! Your code will not execute");
            System.exit(0);
        }
        System.out.println("Congrats your code has executed");
        System.out.println("Congrats your code has executed");
        System.out.println("Congrats your code has executed");
        System.out.println("Congrats your code has executed");
    }
}
