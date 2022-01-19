package Class;


class Square
{
    int Side;

    public int area(int Side)
    {
        return Side*Side;
    }

    public int perimeter(int Side)
    {
        return 4*Side;
    }
}
public class osp_03_Example3 {
    public static void main(String[] args) {
        System.out.println("Class Example 3");
        Square sq = new Square();
        System.out.println(sq.area(3));
        System.out.println(sq.perimeter(3));

    }
}
