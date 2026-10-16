import java.util.Scanner;
public class bus_fare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your travelling distance:");
        int d = in.nextInt(), fare=0;
        if(d>30)
        {
            fare=190 + (d-30)*4;
        }
        else if(d<=30 && d>20)
        {
            fare=140 + (d-20)*5;
        }
        else if(d<=20 && d>10)
        {
            fare=80 + (d-10)*5;
        }
        else
        {
            fare=80;
        }
        System.out.print("Your Ticket fare is $ "+fare);
    }
}
