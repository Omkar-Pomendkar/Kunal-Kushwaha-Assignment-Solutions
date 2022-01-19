package Inherit;

class Employee
{
    int Salary;
    String Name;

    public int  getSalary()
    {
        return Salary;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getName()
    {
        return Name;
    }

}
public class osp_01_Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Employee omkar = new Employee();
        omkar.Salary =100000;
        System.out.println("Salary :"+omkar.getSalary());
        omkar.setName("Omkar Sanjay Pomendkar");
        System.out.println(omkar.getName());
    }
}
