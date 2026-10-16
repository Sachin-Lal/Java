import java.util.Scanner;
public class sumseries
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int s=0,n,a=1,b=0,i;
        System.out.print("Enter the value of n:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+(a+b);
            b=(a+b);
            a=(b-a);
            System.out.print(b+", ");
        }
        System.out.println();
        System.out.print("Sum of the Series:"+s);
    }
}