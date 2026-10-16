import java .util.Scanner;
public class series2 {
    public static void main(String args[])
    {
        // 1, 4, 9, 16, 25,
        // 1, 8, 27, 48, 125,
        // 2, 6, 12, 20, 30, 42
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements to be printed:");
        int n = in.nextInt(),i;
        for(i=1;i<=n;i++)
        {
            System.out.print(i*(i+1)+", ");
        }
    }
}
