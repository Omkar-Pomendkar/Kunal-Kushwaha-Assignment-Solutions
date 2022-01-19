package Class;
class Rectangle
{
    int length;
    int breadth;

    public int area(int length,int breadth)
    {
        return length*breadth;
    }


    public int perimeter(int length,int breadth)
    {
        return 2*(length+breadth);
    }
}
public class osp_04_Example4 {
    public static void main(String[] args) {
        System.out.println("Example 4");
        Rectangle r = new Rectangle();
        System.out.println(r.area(10,20));
        System.out.println(r.perimeter(10,20));
    }
}
