import java.util.Scanner;
public class rev
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,k,rev=0;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        for(k=n;n!=0;n/=10)
            rev=rev*10+n%10;
        if(k==rev)
            System.out.println(k+" is a Palindrome Number.");
        else
            System.out.println(k+" is not a Palindrome Number.");
    }
}