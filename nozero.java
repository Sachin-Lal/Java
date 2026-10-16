import java.util.Scanner;
public class nozero 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,k;
        outerLoop:
        for(i=100;i<=200;i++)
        {
            k=i;
            while(k>0)
            {
                if(k%10==0)
                    continue outerLoop;
                k/=10;
            }
            System.out.print(i+",");
        }
    }
}
