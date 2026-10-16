import java.util.Scanner;
public class pronic {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=in.nextInt(), i,flag=0;
        for(i=1;i<=n/2;i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Pronic Number");
        }
        else
        {
            System.out.println("Not a Pronic Number");
        }
    }
}
