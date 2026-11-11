import java.util.Scanner;
public class complex_pattern2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int i,j,k,n;
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            k=i;
            for(j=-1*(n-1);j<n;j++)
            {
                if(Math.abs(j)%2==i%2  &&  Math.abs(j)<=n-i)
                {
                    System.out.print(k++ +" ");
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