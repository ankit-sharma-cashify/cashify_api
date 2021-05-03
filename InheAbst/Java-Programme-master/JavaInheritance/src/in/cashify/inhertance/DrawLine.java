package in.cashify.inhertance;

public class DrawLine {
    public static String line;
    DrawLine(String line)
    {
        System.out.println("I am in parent class circle constructor");
    }

    public void drawLine()
    {
        System.out.println("Draw Line method");
    }

    public static void main(String[] args) {
        DrawLine d = new DrawLine(line);
        d.drawLine();
    }
}
