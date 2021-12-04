

public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Calculate Area of Circle");
        int radius = 5;

        double area = areacircle(radius);
        System.out.println(area);
        System.out.println(perimeter(radius));
    }
    static double  areacircle(int r)
    {
        double area = 3.14*r*r;
        return area;

    }
    static int perimeter(int r)
    {
        int perimeter = (int) (2*Math.PI*r);
        return perimeter;
    }

}
