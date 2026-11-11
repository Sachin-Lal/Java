import java.util.Scanner;
public class complex_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=-1*(n);j<n;j++)
            {
                if(Math.abs(j)<i)
                {
                    System.out.print(Math.abs(j)+1+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
