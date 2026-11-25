import java.util.Scanner;
public class floyd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n,k=1;
        System.out.print("Enter the Number of Rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }

    }
}
