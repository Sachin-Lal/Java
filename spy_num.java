import java.util.Scanner;
public class spy_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,p=1,s=0,k,d;
        String st;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        for(k=n;k>0;k/=10)
        {
            d=k%10;
            p=p*d;
            s=s+d;
        }
        st=(p==s)?" ":" not ";
        System.out.print(n+" is"+st+"a Spy Number");
    }
}
