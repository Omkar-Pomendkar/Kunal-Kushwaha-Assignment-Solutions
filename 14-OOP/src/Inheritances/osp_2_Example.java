package Inheritances;
class Base
{
    int x;
    Base()
    {
        System.out.println("I am a Constructor");
    }
    Base(int a )
    {
        System.out.println("I am a Overloaded Constructor with value of "+a);
    }
}
class Derived extends Base
{

        Derived()
        {
//            super(0);
            System.out.println("I am a derived class Constructor");
        }
    public int y;

        Derived(int a ,int b)
        {       super(a);
            System.out.println("I am a Overloaded Constructor with value of " +b);
        }



}
class ChildofDerived extends Derived
{
    ChildofDerived()
    {
        System.out.println("I am a Child of Derived Constructor");
    }

    ChildofDerived(int a,int b,int c)
    {   super(a,b);
        System.out.println("I am a Child of Derived Constructor"+c);
    }

}
public class osp_2_Example {
    public static void main(String[] args) {
           // Base b = new Base();
           // Derived d = new Derived(10,20);
            ChildofDerived cd = new ChildofDerived(10,20,30);

    }
}
