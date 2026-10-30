import java.util.Scanner;
public class alternating_01_pattern {
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
}
