import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = in .nextInt(),s=0,i;
        System.out.print("The Factors of "+n+" are:");
        for(i=1;i<=n-1;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+",");
                s+=i;
            }
        }
        System.out.println("\b \b");
        if(n==s)
        {
            System.out.print(n+" is a Perfect Number.");
        }
        else
        {
            System.out.print(n+" is not a Perfect Number.");
        }
    }
}
