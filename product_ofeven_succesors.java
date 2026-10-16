import java.util.Scanner;
public class product_ofeven_succesors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k,n,p=1,d;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        k=n;
        while(k>0)
        {
            d=k%10;
            if(d%2==0)
            {
                p=p*(d+1);
            }
            k/=10;
        }
        System.out.print("The product of Succesors of even digits are: "+p);
    }
}
