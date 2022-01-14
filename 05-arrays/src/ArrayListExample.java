import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList <Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(190);
        list.add(14);
        list.add(34);
      //  System.out.println(list.contains(10));
        //list.set(0,99);
        //list.remove(1);
        //System.out.println(list);
        for (int i = 0; i <= 4; i++) {
           list.add(sc.nextInt());

        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(list.get(i)); // list of index will not work here

        }

    }
}
