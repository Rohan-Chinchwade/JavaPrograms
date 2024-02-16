import java.util.Scanner;
class College
{
    public void courses()
    {
        System.out.println("List Of Courses:1.Electrical\n2.Civil\n3.Mechanical");
    }
}
class Student extends College
{
    String name;
    String course;
    public void enroll()
    {
        courses();
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter your name and course: ");
        name=sc.next();
        course=sc.next();
    }
    public void display()
    {
        System.out.println("Your name is "+name+" and selected course is "+course);
    }
}
class SingleInherit
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.enroll();
        s1.display();
    
    }
}