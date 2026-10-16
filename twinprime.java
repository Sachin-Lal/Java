import java.util.Scanner;
public class twinprime
{
    public boolean checkprime(int n)
    {
        int i;
        for(i=2;i<=n/2+1;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number:");
        a=in.nextInt();
        System.out.print("Enter the second number:");
        b=in.nextInt();
        twinprime ob = new twinprime();
        if(Math.abs(a-b)==2 && ob.checkprime(a) && ob.checkprime(b))
            {
                System.out.println(a+" and "+b+" are Twin Prime Number.");
            }
        else
            {
                System.out.println(a+" and "+b+" are not Twin Prime Number.");
        }
    }
}