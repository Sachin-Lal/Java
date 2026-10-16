import java.util.Scanner;
public class nestedsumseries
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,num,den,s=0;
        System.out.print("Enter the value of n:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            num=0;
            den=1;
            System.out.print("(");
            for(j=1;j<=i;j++)
            {
                num=num+j;
                den=den*j;
            }
            System.out.print(num+"/"+den);
            s+=(num/den);
            System.out.print(")");
        }
        System.out.println();
        System.out.print("The Sum of this series is "+s);
    }
}