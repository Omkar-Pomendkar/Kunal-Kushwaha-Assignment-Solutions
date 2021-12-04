

public class AreaParallelogram {
    public static void main(String[] args) {
        System.out.println("Finding area of Parallelogram");
        int b; int h;int s;
        System.out.println(parallelogram(4,5));
        System.out.println(perimeter(4,5));
    }
    static int parallelogram(int b, int h)
    {
        int area = b*h;
        return area;
    }
    static int perimeter(int s,int b)
    {
        int perimeter = 2*s*b;
        return perimeter;
    }
}
