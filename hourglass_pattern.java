import java.util.Scanner;
public class hourglass_pattern 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,k;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        n=n/2;
        // for(i=-1*n;i<=n;i++)
        // {
        //     for(j=-1*n;j<=n;j++)
        //     {
        //         if(Math.abs(j)<=Math.abs(i))
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }
        // for(i=-1*n;i<=n;i++)
        // {
        //     k=1;
        //     for(j=-1*n;j<=n;j++)
        //     {
        //         if(Math.abs(j)<=Math.abs(i))
        //         {
        //             System.out.print(k++ +" ");
        //         }
        //         else
        //         {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        for(i=-1*n;i<=n;i++)
        {
            k=1;
            for(j=-1*n;j<=n;j++)
            {
                if(Math.abs(j)<=Math.abs(i))
                {
                    System.out.print((char)(k++ +64) +" ");
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

