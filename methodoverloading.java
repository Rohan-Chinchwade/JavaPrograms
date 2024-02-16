class Products
{
    void quantity()
    {
        System.out.println("Number of products quantity.");
    }
    int quantity(int a)
    {
        return a;
    }
    int quantity(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class methodoverloading
{
  public static void main(String args[])
  {
    Products p1=new Products();
    p1.quantity();
    System.out.println("Number of products: "+p1.quantity(1));
    System.out.println("Number of products: "+p1.quantity(1, 1, 1));

  }  
}
