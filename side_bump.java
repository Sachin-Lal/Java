import java.util.Scanner;
public class side_bump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n,k;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        n=n/2;
        // for(i=-1*n;i<=n;i++)
        // {
        //     for(j=0;j<=n;j++)
        //     {
        //         if(Math.abs(j)<=n-Math.abs(i))
        //             System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(i=-1*n;i<=n;i++)
        // {
        //     for(j=0;j<=n-Math.abs(i);j++)
        //     {
        //         System.out.print(j+1 +" ");
        //     }
        //     System.out.println();
        // }
        for(i=-1*n;i<=n;i++)
        {
            for(j=0;j<=n-Math.abs(i);j++)
            {
                System.out.print((char)(65+j) +" ");
            }
            System.out.println();
        }
    }
}
