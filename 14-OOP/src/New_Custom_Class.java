class Employees
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
class Cellphone
{
    public void ringing()
    {
        System.out.println("Your Phone is Ringing");
    }
    public void vibrating()
    {
        System.out.println("Your phone is Vibrating");
    }
}

public class New_Custom_Class {
    public static void main(String[] args) {
        System.out.println("Create a Class Employee with Following Methods & Properties");
        //problem1
        Employees omkar = new Employees();
        omkar.setName("Omkar Pomendkar one");
        System.out.println(omkar.getName());
        omkar.salary =900;
        System.out.println(omkar.getSalary());
        Cellphone c = new Cellphone();
        c.ringing();
        c.vibrating();

    }
}
