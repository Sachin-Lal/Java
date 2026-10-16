import java.util.Scanner;
public class pattern3 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print(n-i+1+"  ");
            }
            System.out.println();
        }
    }
}
