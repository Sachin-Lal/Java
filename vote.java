import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = in.nextInt();
        System.out.println("Do you carry eligible Id or not?");
        System.out.print("Enter 1 for yes and 0 for no:");
        int id = in.nextInt();
        if(age >= 18 || id != 0)
        {
            System.out.println("You are eligible to vote.");
        }
        else
        {
            System.out.println("You are not eligible to vote.");
        }
    }
    
}
