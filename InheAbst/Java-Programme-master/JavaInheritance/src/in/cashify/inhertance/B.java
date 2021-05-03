package in.cashify.inhertance;

public class B extends A {
    public static int a;
    public static int b;

    B(int a, int b)
    {
        super(a, b);
    }

    public static void main(String[] args) {
        A obj= new A(10, 20);
        obj.add(a,b);
    }
}
