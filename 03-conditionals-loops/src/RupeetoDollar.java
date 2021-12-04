

import java.util.Scanner;

public class RupeetoDollar {
    public static void main(String[] args) {
        System.out.println("Rupee to Dollar");
        Scanner sc = new Scanner(System.in);
        float rupee = sc.nextFloat();

//        1 rupee = 0.014$
        System.out.println(rupee*0.014f);
    }
}
