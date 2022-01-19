package Inherit;
class Cellphone
{
    public void ring()
    {
        System.out.println("Ringing......");
    }

    public void vibrate()
    {
        System.out.println("Vibrating.......");
    }
}
public class osp_02_Example {
    public static void main(String[] args) {
        System.out.println("Inheritance");
        Cellphone c = new Cellphone();
        c.ring();
        c.vibrate();
    }
}
