
import java.util.Scanner;
public class twisted_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,rev=0,k;
        System.out.print("Enter a number:");
        n=in.nextInt();
        twisted_prime ob = new twisted_prime();
        for(k=n;k>0;k/=10)
            rev=rev*10 + k%10;
        if(ob.check_prime(n) && ob.check_prime(rev))
            System.out.println(n+" is a Twisted Prime Number.");
        else
            System.out.println(n+" is not a Twisted Prime Number.");
    }
    
    
    public boolean check_prime(int n)
    {
        int i;
        if(n<=2)
            return true;
        for(i=2;i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }
}
