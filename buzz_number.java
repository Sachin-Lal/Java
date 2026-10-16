import java.util.Scanner;
public class buzz_number {
    // 77 or 777
    public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number:");
    n=in.nextInt();
    if (n%7==0 && n%10==7)
    {
        System.out.println(n+" is a Buzz Number.");
    }
    else{
        System.out.println(n+" is not a Buzz Number.");
    }
    }

    
}
