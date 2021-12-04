

public class AreaRectangle {
    public static void main(String[] args) {
        System.out.println("Area of Triangle");
        int length = 5;
        int breadth = 5;
        int width = 7;
        System.out.println(perimeter(length,width));
        double area = areaTriangle(length,breadth);
        System.out.println(area);
        System.out.println();

    }
    static double areaTriangle(int l,int b)
    {
        double area = b*l;
        return area;

    }
    static int perimeter(int l,int w)
    {
        int perimeter = 2*l*w;
        return perimeter;
    }

}



