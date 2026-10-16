import java.util.Scanner;
public class input
{
    public static void main(String args[])
    {
        String fname,lname;
        int age;
        float height;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter you First Name:");
        fname = ob.next();
        System.out.print("Enter you Last Name:");
        lname = ob.next();
        System.out.print("Enter you Age:");
        age = ob.nextInt();
        System.out.print("Enter you Height:");
        height = ob.nextFloat();
        System.out.print("Your name is "+fname+" "+lname+". You are "+age+" years old. You are "+height+" ft tall.");
    }
}
