package Constructor;

public class constrA {

	int a =10;
	int b =20;
	
	public static void main(String[] args) {
		constrA p = new constrA(15, 30);
		
		
	}

	constrA(int a, int b)
	{
		this.a=a;
		this.b=b;
		int c= a+b;
		System.out.println("constructor "+ c);
	}
	
	
}
