import java.util.Scanner;
public class seriesa3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sign=-1;
        double n,S=0,a,k=1,i;
        System.out.print("Enter the value of n:");
        n=in.nextInt();
        System.out.print("Enter the value of a:");
        a=in.nextInt();
        k=a;
        for(i=1;i<=n;i++)
        {
            sign=sign*-1;
            S=S+sign*k;
            System.out.print(sign*k+", ");
            k=k*a*a;
        }
        System.out.println();
        System.out.print("Sum of the Series:"+S);
    }
 }