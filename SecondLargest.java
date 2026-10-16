import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, l1,l2,k;
        System.out.println("Enter the Number of Terms:");
        n=in.nextInt();
        System.out.print("Enter the First Number:");
        l1=l2=in.nextInt();
        for(int i=1;i<=n-1;i++)
        {
            System.out.print("Enter the next Number:");
            k=in.nextInt();
            if(k>l1)
            {
                l2=l1;
                l1=k;
            }
        }
        System.out.println("The Largest Number is "+l1);
        System.out.println("The Second Largest Number is "+l2);
    }
}
