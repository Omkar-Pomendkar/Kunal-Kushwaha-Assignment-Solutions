package Class;
class Circle
{
//    area = pi*r*r
//    perimeter = 2*pi*r
    int radius;

    public double area (int radius)
    {
        return 3.14*radius*radius;
    }
    public double perimeter (int radius)
    {
        return 3.14*radius*2;
    }

}
public class osp_06_Example6 {
    public static void main(String[] args) {
        System.out.println("Circle Class Example");
        Circle c = new Circle();
        System.out.println(c.area(8));
        System.out.println(c.perimeter(8));
    }
}
