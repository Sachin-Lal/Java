import java.util.Scanner;
public class neon
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=in.nextInt(),s,sum=0;
        s=n*n;
        while(s!=0)
        {
            sum+=s%10;
            s/=10;
        }
        if(sum==n)
        {
            System.out.println(n+" is an Neon Number.");
        }
        else
        {
            System.out.print(n+" is not an Neon Number.");
        }
    }

}