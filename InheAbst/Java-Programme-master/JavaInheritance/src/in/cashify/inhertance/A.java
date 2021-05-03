package in.cashify.inhertance;

public class A {
    public static int a;
    public static int b;

    public static void main(String[] args) {
        A obj= new A(10, 20);
        obj.add(a,b);

    }
    A(int a, int b)
    {
        this.a= a;
        this.b = b;

    }


    public void add(int a, int b)
    {
        int c= a+b;
        System.out.println("value of c "+c);
    }
}
