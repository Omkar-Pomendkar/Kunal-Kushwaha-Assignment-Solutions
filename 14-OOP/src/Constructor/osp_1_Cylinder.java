package Constructor;

class Cylinder
{
    private int radius;
    private int height;

    Cylinder(int radius)
    {
        System.out.println("I am a Construtor");
    }
    Cylinder(int radius,int height)
    {
        System.out.println("I am parameterized Construtor");
    }
    public double surfaceArea()
    {
        return 2*Math.PI*radius*height+2*Math.PI*radius*2;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class osp_1_Cylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(10,20);
        c.setRadius(10);
        c.setHeight(12);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
        System.out.println(c.surfaceArea());

    }
}
