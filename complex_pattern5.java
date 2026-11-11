import java.util.Scanner;
public class complex_pattern5 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,k;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        n=n/2+1;
        // for(i=-1*(n-1);i<n;i++)
        // {
        //     for(j=0;j<n;j++)
        //     {
        //         if(j<(n-Math.abs(i))-1)
        //             System.out.print("  ");
        //         else
        //             System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(i=-1*(n-1);i<n;i++)
        {
            k=1;
            for(j=0;j<n;j++)
            {
                if(j<(n-Math.abs(i))-1)
                    System.out.print("  ");
                else
                    System.out.print((char)(64 + k++) +" ");
            }
            System.out.println();
        }
    }
}
