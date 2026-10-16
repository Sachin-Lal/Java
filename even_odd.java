import java.util.Scanner;
public class even_odd {
    public static void main(String srgs[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n=in.nextInt();
        if(n%2 == 0)
        {
            System.out.println("Its divisible by 2");
            System.out.println("Its an even number");
        }
        else
        {
            System.out.println("Its not divisible by 2");
            System.out.println("Its an odd number");
        }


    }
}
