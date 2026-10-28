import java.util.Scanner;
public class book_pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the Number of rows:");
        n=in.nextInt();
        for(i=1;i<=2*n-1;i+=2)
        {
            for(j=i;j>=1;j-=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
