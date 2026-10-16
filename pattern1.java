import java.util.Scanner;
public class pattern1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
