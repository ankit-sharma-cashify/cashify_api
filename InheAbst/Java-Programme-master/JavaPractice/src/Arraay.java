
public class Arraay {
	
	
	
	public static void main(String[] args) {
		
		Arraay t = new Arraay();
		t.demo(new int[]{10,22,44,66});
		//int a[]= {10,22,44,66};
		//t.demo(a);
				
	}

	void demo(int a[])
	{
		int min = a[0];
		
		for(int i=0;i<a.length; i++)
		{
			 
			if (min>a[i])
				min=a[i];
			 
		}
		System.out.println("min no.  " + min); 
	}
	
	
}
