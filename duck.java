import java.util.Scanner;
public class duck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k,d,flag=0;
        System.out.println("Enter a Number:");
        n=in.nextInt();
        k=n;
        while(k>0)
            
        {
            d=k%10;
            if(d==0)
            {
                flag=1;
                break;
            }
            k/=10;
        }
        if(flag==0)
        {
            System.out.println("It is not a Duck Number.");
        }
        else{
            System.out.println("It is a Duck Number.");
        }
    }
}
