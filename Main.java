class Student
{
    String name, teacher;
    int roll;
}

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name="Jay";
        s1.roll=1;
        s1.teacher="Jhon";

        s2.name="Alex";
        s2.roll=2;
        s2.teacher="Jasmine";

        System.out.println("Name of Student:"+s1.name);
        
        System.out.println("Roll of Student:"+s1.roll);
        
        System.out.println("Assigned Teacher:"+s1.teacher);
        
        
        System.out.println("Name of Student:"+s2.name);
        
        System.out.println("Roll of Student:"+s2.roll);
        
        System.out.println("Assigned Teacher:"+s2.teacher);

    }
}