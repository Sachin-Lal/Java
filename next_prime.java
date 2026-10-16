import java.util.Scanner;
public class next_prime {

    public static boolean is_prime(int n)
    {
        int i;
        for(i=2;i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        if(is_prime(n))
            System.out.println(n+" is a Prime Number.");
        else
        {
            System.out.println(n+" is NOT a Prime Number.");
            for(i=n+1;;i++)
                if(is_prime(i))
                {
                    System.out.println(i+" is the next Prime Number.");
                    break;
                }
        }

    }
}
