package in.cashify.inhertance;

public class DrawCircle extends DrawLine{
    public static String circle;

    public static void main(String[] args) {
        DrawCircle c= new DrawCircle("circle");
        c.addCircle();
    }

    DrawCircle(String circle)
    {
        super(circle);
        System.out.println("I am in child class circle constructor");
    }
    public void addCircle()
    {
        System.out.println("Method called circle drawn");
    }
}
