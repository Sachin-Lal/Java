import java.util.Scanner;
public class patternRtriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the Number of Rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j<=n-i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
}
