class Employee
{
    int id;
    String Name;
    public void printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My Name is "+Name);
    }

}

public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("Creating Class");
        Employee omkar = new Employee();
        Employee john = new Employee();
        omkar.id = 10;
        john.id = 16;
        john.Name = "John Dhoklawala";
        omkar.Name = "Omkar Pomendkar";
        //Setting Atributes/Properties
//        System.out.println(omkar.id);
//        System.out.println(omkar.Name);

        omkar.printDetails();
        john.printDetails();

    }


}
