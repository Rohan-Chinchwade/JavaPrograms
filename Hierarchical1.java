class Animal
    {  
        public void action()
        {
            
            System.out.println("Animal Class.");
        }  
    }  
    class Dog extends Animal
    {  
        public void action1()
        {
            System.out.println("Dog Class.");
        }  
    }  
    class Cat extends Animal
    {  
        public void action2()
        {
            System.out.println("Cat Class.");
        }  
    }  
    class Hierarchical1
    {  
        public static void main(String args[])
        {  
            Cat c=new Cat();  
            c.action();  
            c.action2();
            System.out.println("A: "+c.x);
      
        }
}  
    