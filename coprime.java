import java.util.Scanner;
public class coprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n1,n2,m;
        boolean flag=true;
        System.out.println("Please Enter the Value of n1:");
        n1=in.nextInt();
        System.out.println("Please Enter the Value of n2:");
        n2=in.nextInt();
        m=Math.min(n1, n2);
        for(i=2;i<=m;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                flag=false;
            }
        }
        if(flag)
        {
            System.out.println(n1+" and "+n2+" are co-prime numbers.");
        }
        else
        {
            System.out.println(n1+" and "+n2+" are not co-prime numbers.");
        }
    }
}
