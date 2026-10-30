import java.util.Scanner;
public class eleven_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number of rows:");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println((int)Math.pow(11,i));
        }
    }
}
