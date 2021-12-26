public class Conditions_Loops {
    public static void main(String[] args) {
        System.out.println("Conditions & Loops");
        /*
        if(condition)
        {
        }
        else
        {
        }
         */
        int salary = 20000;
        if(salary < 10000)
        {
            salary += 2000;
        }
        else if(salary > 20000)
        {
            salary += 1000;
        }
        else {
            salary += 5000;
        }
        System.out.println(salary);
    }
}
