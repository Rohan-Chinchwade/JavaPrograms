import java.util.Scanner;
import java.io.*;

class Col
{
    String clgname="AbcXyz";
    static int id=1;
}
class college extends Col
{
    public void display()
    {
        System.out.println("List of courses:1.CS\n2.E&TC\n3.Civil");
    }
}
class iicmr extends college
{
    Scanner sc=new Scanner(System.in);
    String name;
    String course;
    public void display1()
    {
        System.out.println("Enter your name: ");
        name=sc.next();
        System.out.println("Enter course: ");
        course=sc.next();
    }
    public void display2()
    {
        System.out.println("Collegename: "+clgname);
        System.out.println("CollegeId: "+id);
        id=id+1;;
        System.out.println("CandidateName: "+name);
        System.out.println("Course Selected: "+course);
    }
}
class Mulinherit
{
    public static void main(String args[])
    {
        iicmr i1=new iicmr();
        i1.display();
        i1.display1();
        i1.display2();
        iicmr i2=new iicmr();
        i2.display();
        i2.display1();
        i2.display2();


    }
}