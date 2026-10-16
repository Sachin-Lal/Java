import java.util.Scanner;
public class rectangle {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,m;
        System.out.print("Enter the height of the Rectangle:");
        n=in.nextInt();
        System.out.print("Enter the width of the Rectangle:");
        m=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
