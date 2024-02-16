class RAM
{
    public RAM(String app)
    {
        System.out.println(app+" Application has arrived in the primary memory.");
    }
}
class phone extends RAM
{
    public phone()
    {
        super("WhatsApp");
        System.out.println("Application running");
    }
}
class constructoverride
{
    public static void main(String args[])
    {
        phone p1=new phone();
    }
}