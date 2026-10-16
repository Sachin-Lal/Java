import java.util.Scanner;
public class multiple_harshad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,k,s,flag=0;
        System.out.print("Enter a number:");
        n=in.nextInt();
        k=n;
        outer:
        while(k>9)
        {
            s=0;
            for(int i=k;i>0;i/=10)
            {
                s+=i%10;
            }
            if(k%s!=0)
            {
                flag=1;
                break outer;
            }
            k=s;
        }
        if(flag==0)
        {
            System.out.println(n+" is a Multiple Harshad Number.");
        }
        else{
            System.out.println(n+" is not a Multiple Harshad Number.");
        }
    }   
}