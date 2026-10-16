import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = in.nextInt(),s,d1,d2,flag=0,k;
        s=n*n;
        k=n;
        while(n!=0)
        {
            d1=n%10;
            d2=s%10;
            if(d1!=d2)
            {
                flag=1;
                break;
            }
            s=s/10;
            n=n/10;
        }
        if(flag==0)
        {
            System.out.println(k+" is an Automorphic Number.");
            System.out.println("Squared Value of "+k+" is "+k*k);
        }
        else
        {
                
            System.out.println(k+" is not an Automorphic Number.");
            System.out.println("Squared Value of "+k+" is "+k*k);
        }
    }
}