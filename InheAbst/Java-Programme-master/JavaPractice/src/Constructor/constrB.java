package Constructor;

public class constrB extends constrA{

	int a =10;
	int b =20;
	
	public static void main(String[] args) {
		constrB p = new constrB(15, 30);
		
		
	}

	constrB(int a, int b)
	{ 	super(2,5);
	
		
		int c= a*b;
		System.out.println("constructor "+ c);
	}
	
	
}
