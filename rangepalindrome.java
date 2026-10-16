import java.util.Scanner;
public class rangepalindrome {
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        int i, rev,k;
        for(i=10;i<=1000;i++)
        {
            k=i;
            rev=0;
            while(k>0)
            {
                rev=rev*10 + k%10;
                k/=10;
            }
            if(i==rev)
            {
                System.out.print(i+",");
            }
        }

    }
}