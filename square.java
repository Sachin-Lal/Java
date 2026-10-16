import java.util.Scanner;
public class square {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the side of 'n':");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
