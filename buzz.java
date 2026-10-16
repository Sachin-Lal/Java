import java.util.Scanner;
public class buzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = in.nextInt();
        if(n%10==7 || n%7==0)
        {
            System.out.print(n+" is a Buzz Number.");
        }
        else
        {
            System.out.println(n+" is nto a Buzz Number.");
        }
    }
}
