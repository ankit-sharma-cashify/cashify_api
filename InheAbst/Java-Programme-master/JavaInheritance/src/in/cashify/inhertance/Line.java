package in.cashify.inhertance;

public class Line extends Shape{
    String name = "Line.java";

    Line(String name) {
        super(name);
        this.name=name;

    }

    public static void main(String[] args) throws Exception {
        Line l = new Line("No of Lines");
        l.draw();
        l.MyLineDraw();
    }

    @Override
    public void draw() throws Exception {
      System.out.println("My line:_______________________");

    }

    @Override
    public void AbstrctMethd() {
        System.out.println("I am in AbstrctMethd of Line Class");
    }

    public void MyLineDraw()
    {
        System.out.println("=======================");
    }

}
