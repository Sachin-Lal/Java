import java .util.Scanner;
public class series3 {
    public static void main(String args[])
    {
        // 0, 3, 8, 15
        // 0, 7, 26
        // 2, 5, 10
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements to be printed:");
        int n = in.nextInt(),i;
        for(i=1;i<=n;i++)
        {
            System.out.print((i*i*i)-1+", ");
        }
    }
}