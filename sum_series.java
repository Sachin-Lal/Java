import java.util.Scanner;
public class sum_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double i,j,n,p;
        double s=0;
        System.out.print("Enter the Number of Terms:");
        n=in.nextInt();
        for(i=1;i<n*2;i+=2)
        {
            p=1;
            for(j=1;j<=i/2 +1;j++)
            {
                p=p*j;
            }
            s+=i/p;
        }
        System.out.print("The Sum:"+s);
    }
}
