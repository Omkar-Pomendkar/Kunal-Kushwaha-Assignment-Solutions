package Abstract;
abstract class Parent
{
    Parent()
    {
        System.out.println("I am base's Constructor");
    }
    public void sayHello()
    {
        System.out.println("HEllo");
    }
    abstract public void greet();

}
class Child extends Parent
{
    @Override
    public void greet()
    {
        System.out.println("GoodMorning");
    }
}
public class Abstract_01 {
    public static void main(String[] args) {
        Child c = new Child();
//        Parent p = new Parent(); -- you cannot create object of Abstract Class
    }
}
