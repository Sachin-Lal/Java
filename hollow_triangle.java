import java.util.Scanner;
public class hollow_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        n=n-1;
        for(i=0;i<=n;i++)
        {
            for(j=-n;j<=n;j++)
            {
                if(i==n || i==Math.abs(j))
                {
                    System.out.print((char)(Math.abs(j)+65)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
