import java.util.Scanner;
public class range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int st, en, i;
        System.out.print("Enter the Starting Point:");
        st=in.nextInt();
        System.out.print("Enter the Ending Point:");
        en=in.nextInt();
        System.out.println("All Numbers between "+st+" and "+en+":");
        for(i=st;i<=en;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"(Even Number)");
            }
            else
            {
                System.out.println(i+"(Odd Number)");
            }
        }
    }
}
