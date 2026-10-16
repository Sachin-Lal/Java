import java.util.Scanner;
public class special_number {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,i,j,p,s=0;
        System.out.print("Enter a Number:");
        n=in.nextInt();
        for(i=n;i>0;i/=10)
        {
            p=1;
            for(j=1;j<=i%10;j++)
            {
                p=p*j;
            }
            s+=p;
        }
        if(s==n)
        {
            System.out.print("Its a Special Number.");
        }
        else{
            System.out.println("Its not a Special Number.");
        }
    }
}
