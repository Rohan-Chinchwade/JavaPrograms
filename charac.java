class charac
{
    public static void main(String args[])
    {
        char a='A';
        if(a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9')
        System.out.println("Number");
        else
        {
            if(a>=65&&a<=90||a>=97&&a<=122)
            System.out.println("alphabet");
            else
            System.out.println("Special Symbol");
        }
    }
}