import java.util.Scanner;
public class adder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the first number:");
        a=in.nextInt();
        System.out.print("Enter the second number:");
        b=in.nextInt();
        c=a+b;
        System.out.println("The Sumation of "+a+" and "+b+" = "+c);
    }
}
