import java.util.Scanner;
public class twin_prime {

    public boolean is_prime(int n)
    {
        int i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the First Number:");
        a=in.nextInt();
        System.out.print("Enter the Second Number:");
        b=in.nextInt();
        twin_prime ob = new twin_prime();
        if(Math.abs(a-b)==2 && ob.is_prime(a) && ob.is_prime(b))
        {
            System.out.print(a+" and "+b+" are twin Prime");
        }
        else{
            System.out.print(a+" and "+b+" are not twin Prime");
        }

    }
}