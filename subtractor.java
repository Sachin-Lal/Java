import java.util.Scanner;
public class subtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the first number(subtracted from):");
        a=in.nextInt();
        System.out.print("Enter the second number(subtracted by):");
        b=in.nextInt();
        c=a-b;
        System.out.println("The Negation of "+a+" and "+b+" = "+c);
    }
}
