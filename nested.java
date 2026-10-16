import java.util.Scanner;
public class nested
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,m,i,j;
        System.out.print("Enter the limit of outer loop:");
        n=in.nextInt();
        System.out.print("Enter the limit of inner loop:");
        m=in.nextInt();

        for(i=1;i<=n;i++)
        {
            System.out.println("----Outer:"+i+"----");
            for(j=1;j<=m;j++)
            {
                System.out.println("Inner:"+j);
            }
        }
    }
}