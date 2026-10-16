import java.util.Scanner;
public class auto
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,s,k,flag=0,d1,d2;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        s=n*n;
        for(k=n;k>0;)
        {
            d1=k%10;
            d2=s%10;
            if(d1!=d2)
            {
                flag=1;
                break;
            }
            s=s/10;
            k=k/10;
        }
        if(flag==0)
        {
            System.out.print("This is an Automorphic Number.");
        }
        else{
            System.out.print("This is not an Automorphic Number.");
        }

    }
}