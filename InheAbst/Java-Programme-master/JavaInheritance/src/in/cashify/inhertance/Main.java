package in.cashify.inhertance;

public class Main {
    public static void main(String[] args) throws Exception {
        Shape s = new Line("reena");
         s.draw();
         s.AbstrctMethd();
        Line t = new Line("MyLineDraw");
        t.MyLineDraw();
        System.out.println(t.name);

    }
}
