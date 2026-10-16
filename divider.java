import java.util.Scanner;
public class divider {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the numerator:");
        a=in.nextInt();
        System.out.println("Enter the denominator:");
        b=in.nextInt();
        if(b==0)
        {
            System.out.print("Cannot divide by zero!!");
        }
        else
        {
            c=a/b;
            d=a%b;
            System.out.println("Quotient for Division of "+a+" and "+b+" is "+c);
            System.out.println("Remainder for Division of "+a+" and "+b+" is "+d);
            
        }
    
    
    }
}
