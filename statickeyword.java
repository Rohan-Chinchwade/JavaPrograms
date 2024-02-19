class demo
{
    static int x=1;
    int y=1;
    void fun()
    {
        x++;
        y++;
        System.out.println("Static: "+x);
        System.out.println("NonStatic: "+y);
    }
}
public class statickeyword
{
    public static void main(String args[])
    {
        demo d1=new demo();
        d1.fun();
        demo d2=new demo();
        d2.fun();
    }    
}
