import java.util.Scanner;
public class patternsquareboundary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the Number of rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if( i==1 || j==1 || i==n || j==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
