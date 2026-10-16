import java.util.Scanner;
public class special {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,s=0,p=1,k;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        k=n;
        while(k>0)
        {
            s+=k%10;
            p*=k%10;
            k/=10;
        }
        if((p+s)==n)
        {
            System.out.println(n+" is a Special Number.");
        }
        else
        {
            System.out.println(n+" is not a Special Number.");
        }

    }
}
