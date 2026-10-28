import java.util.Scanner;
public class book_pattern5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of Rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j<i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print((n-i+1)+" ");
                }
            }
            System.out.println();
        }
}
}