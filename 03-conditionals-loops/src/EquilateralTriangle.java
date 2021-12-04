
public class EquilateralTriangle {
    public static void main(String[] args) {
        System.out.println("Area of Equilateral Triangle");
        float side = 34f;
        int side1 = 5;
        System.out.println(equilateral(side));
        System.out.println(perimeter(side1));

    }
    static float equilateral(float side)
    {
        float area = (float) ((1.73/4)*side*side);
        return area;
    }
    static int perimeter(int  side1)
    {
        int perimeter = 3*side1;
        return perimeter;
    }
}
