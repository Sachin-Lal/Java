import java.util.Scanner;
public class alternate_pattern
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int i,j,n;
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                    System.out.print("y ");
                else
                    System.out.print("x ");
            }
            System.out.println();
        }
    }
}