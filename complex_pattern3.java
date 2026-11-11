import java.util.Scanner;
public class complex_pattern3 {
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    int i,j,k,n,q;
    System.out.print("Enter the value of n:");
    String st;
    n=in.nextInt();
    for(i=1;i<=n;i++)
    {
        k=(int)Math.pow(11, i-1);
        st=Integer.toString(k);
        q=0;
        for(j=-1*(n-1);j<n;j++)
        {
            
            if(Math.abs(j)<i && Math.abs(j+1)%2==i%2)
            {
                System.out.print(st.charAt(q++)+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
}
