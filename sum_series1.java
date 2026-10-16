import java.util.Scanner;
public class sum_series1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n, a, i, f=1, s=0;
        int sign=-1;
        System.out.print("Enter the Number of terms:");
        n=in.nextInt();
        System.out.print("Enter the value of a:");
        a=in.nextInt();
        for(i=1;i<=n;i++)
        {
            sign=sign*-1;
            f=f*i;
            s=s+(sign*(a/f));
        }
        System.out.print("Sum="+s);
    }
}
