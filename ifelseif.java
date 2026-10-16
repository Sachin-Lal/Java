import java.util.Scanner;
public class ifelseif {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks");
        int n = in.nextInt();

        if(n>=90)
            System.out.println("Your Grade is A+");
        else if(n>=80)
            System.out.println("Your Grade is A");
        else if(n>=70)
            System.out.println("Your Grade is B");
        else if(n>=60)
            System.out.println("Your Grade is C");
        else if(n>=50)
            System.out.println("Your Grade is D");
        else if(n>=40)
            System.out.println("Your Grade is E");
        else
            System.out.println("Your Grade is F");
    }
}


/*
A-> 90-100 if marks>=90
B-> 80-89  elseif marks>=80
C-> 70-79  elseif marks>=70
D-> 60-69
E-> 50-59
F-> 0-49

*/