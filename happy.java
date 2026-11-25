import java.util.Scanner;
public class happy {

    public static void main(String[] args) {
        int n,k,s,d,p;
        boolean flag=true;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number:");
        n=in.nextInt();
        k=n;
        while(n>9)
        {
            p=n;
            s=0;
            while(p>0)
            {
                s+=(p%10)*(p%10);
                p/=10;
            }
                n=s;
            }
        if(n==1)
        {
            System.out.print(k+" is a Happy Number");
        }
        else{
            System.out.print(" is not a Happy Number");
        }
    }
}
