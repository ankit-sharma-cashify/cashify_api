package in.cashify.inhertance;

public abstract class Shape {

    String name = "shape.java";

    public static void main(String[] args) throws Exception {

    }

    Shape(String name)
    {
        this.name =name;
    }

    public void draw() throws Exception {
        throw new Exception ("override this");
    }

    public abstract void AbstrctMethd();


    public void drawShape() {
        System.out.println("Draw Shape");
    }


}
