import java.util.Scanner;
public class seriesa1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i, n, a,S=0, k=1;
        System.out.println("Enter the value of n:");
        n=in.nextInt();
        System.out.println("Enter the value of a:");
        a=in.nextInt();
        for(i=1;i<=n;i++)
        {
            k=k*a;
            S=S+k;
            System.out.print(k+", ");
        }
        System.out.println();
        System.out.println("Series Sum: "+S);
    }
}
