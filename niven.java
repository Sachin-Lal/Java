import java.util.Scanner;
public class niven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k,s=0,d;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        for(k=n;k>0;k=k/10)
            s+=k%10;
        if(n%s==0)
            System.out.print(n+" is a Niven Number.");
        else
            System.out.print(n+" is not a Niven Number.");
    }
}
