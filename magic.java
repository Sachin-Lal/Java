import java.util.Scanner;
public class magic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s,n,k;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        k=n;
        while(k>9)
        {
            s=0;
            for(int i=k;i>0;i/=10)
            {
                s=s+i%10;
            }
            k=s;
        }
        if(k==1)
            {
                System.out.print(n+" is a Magic Number.");
            }
        else
        {
            System.out.print(n+" is not a Magic Number.");
        }
    }
}
