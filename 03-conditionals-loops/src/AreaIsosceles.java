
public class AreaIsosceles {
    public static void main(String[] args) {
        System.out.println("Area of Triangle");
        int base = 5;


        double area = areaIsosceles(base);
        System.out.println(area);

    }
    static double areaIsosceles(int b)
    {
        double area = 0.5*b;
        return area;

    }

}



