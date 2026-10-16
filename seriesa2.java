import java.util.Scanner;
public class seriesa2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int i,a,n,S=0;
       System.out.print("Enter the Value of a:");
       a=in.nextInt();
       System.out.print("Enter the value of n:");
       n=in.nextInt();
       for(i=a+1;i<=a+n;i++)
       {
        S+=i;
        System.out.print(i+", ");
       }
       System.out.println();
       System.out.print("The Series Sum :"+S);
    }
    
}
