import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = in.nextInt(),s1=1,s2=0,d,k=n;
        while(n!=0)
        {
            d=n%10;
            s1=s1*d;
            s2=s2+d;
            n=n/10;
        }
        if(s1==s2)
            System.out.print(k+" is a Spy Number");
        else
            System.out.print(k+" is not a Spy Number");
    }
}