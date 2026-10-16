import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,p=1,i;
        System.out.print("Enter the number:");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            p=p*i;
        }
        System.out.print("Factorial of "+n+" is "+p);
    }
}
