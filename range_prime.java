import java.util.Scanner;
public class range_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n,flag,k,m;
        System.out.print("Enter the Max range:");
        m=in.nextInt();
        System.out.print("The Prime numbers between "+1+" and "+m+":");
        for(i=1;i<=m;i++)
        {
            n=i;
            flag=0;
            for(k=2;k<=n/2;k++)
            {
                if(n%k==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(i+",");
            }
        }
    }
}
