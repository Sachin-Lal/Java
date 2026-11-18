import java.util.Scanner;
public class opposite_side_bump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        n=n/2;
        for(i=-n;i<=n;i++)
            {
                for(j=0;j<=n;j++)
                    {
                        if(j>=Math.abs(i))
                        {
                            System.out.print((char)(j+65)+" ");
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