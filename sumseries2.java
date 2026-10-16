import java.util.Scanner;
public class sumseries2 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i, sign=1,s=0,n,d;
        System.out.println("Enter the value of n:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            d=(i*2)*sign;
            System.out.print(d+", ");
            s+=d;
            sign=sign* -1;
        }
        System.out.println();
        System.out.print("The Sum of the Series is "+s);
    }    
}
