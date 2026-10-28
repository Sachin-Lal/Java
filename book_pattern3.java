import java.util.Scanner;
public class book_pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        float i,j,k,n;
        n=in.nextInt();
        k=(n+1)*(n/2);
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((int)k+"  ");
                k--;
            }
            System.out.println();
        }
    }
}
