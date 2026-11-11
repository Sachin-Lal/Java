import java.util.Scanner;
public class complex_pattern4 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        n=n/2+1;
        // for(i=-1*(n-1);i<n;i++)
        // {
        //     for(j=0;j<=Math.abs(i);j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(i=-1*(n-1);i<n;i++)
        // {
        //     for(j=0;j<=Math.abs(i);j++)
        //     {
        //         System.out.print(j+1+" ");
        //     }
        //     System.out.println();
        // }
        for(i=-1*(n-1);i<n;i++)
        {
            for(j=0;j<=Math.abs(i);j++)
            {
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();
        }
    }
}
