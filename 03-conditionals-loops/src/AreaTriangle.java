
public class AreaTriangle {
    public static void main(String[] args) {
        System.out.println("Area of Triangle");
        int base = 5;
        int height = 5;

        double area = areaTriangle(base,height);
        System.out.println(area);

    }
    static double areaTriangle(int b,int h)
    {
        double area = 0.5*b*h;
        return area;

    }

}

