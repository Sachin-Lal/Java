import java .util.Scanner;
public class series1
{
    public static void main(String args[])
    {
        // 1,2,3,
        // 1, 3, 5, 7
        // 13, 10, 7, 4
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements to be printed:");
        int n = in.nextInt(),k=13;
        while(n>=0)
        {
            System.out.print(k+", ");
            k=k-3;
            n--;
        }
    }
}