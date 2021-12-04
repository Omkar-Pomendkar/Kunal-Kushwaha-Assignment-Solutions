

public class VolumeCone {
    public static void main(String[] args) {
        System.out.println("Calculate Volume of Cone");
        System.out.println(Volume(12,10));
    }
    static double Volume(int r,int h)
    {
        return (Math.PI*r*r)*(h/3);
    }
}
