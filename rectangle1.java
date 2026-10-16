import java.util.Scanner;
public class rectangle1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,m;
        System.out.print("Enter the row size:");
        n=in.nextInt();
        System.out.print("Enter the column size:");
        m=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}