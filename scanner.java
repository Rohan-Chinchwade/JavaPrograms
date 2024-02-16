import java.io.*;
import java.util.Scanner;
class scanner
{
    String servUN="AbcInd.";
    String servP="abc@123";
    String userUN;
    String userP;
    Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        String servUN="AbcInd.";
        String servP="abc@123";
        String userUN;
        String userP;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username: ");
        userUN=sc.next();
        System.out.println("Enter Password: ");
        userP=sc.next();
        if(servUN.equals(userUN)&&servP.equals(userP))
        System.out.println("Login Sucessful..");
        else
        System.out.println("Username or password are incorrect.");

    }


}