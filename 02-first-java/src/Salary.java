public class Salary {
    public static void main(String[] args) {
        /*
        if(Condition is T / F)
         */

        int salary = 51000;
        if(salary < 30000)
        {
            salary += 5000;
        }
        else if (salary >50000)
        {
            salary += 10000;
        }
        else
        {
            salary = 10000;
        }
        System.out.println(salary);
    }

}
