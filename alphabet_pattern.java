import java.util.Scanner;
public class alphabet_pattern
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int i,j,n;
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n-i+1;j<=n;j++)
            {
                System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}