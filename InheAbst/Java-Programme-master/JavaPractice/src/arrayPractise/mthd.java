package arrayPractise;

public class mthd {

	public static void main(String[] args) {
	final	int n =10;
		int[] y = returnArray(n);
		
		for (int i = 0; i <y.length; i++)
	      {
	          System.out.print(y[i] + " ");
	      }
	}
	
	
	public static int [] returnArray(int n)
	{
		int[] x = new int[n];
		
		for (int i=0; i<x.length; i ++)
		{
			x[i] = (int) (Math.random()*20);
		
		
		}
		return x;
		
		
	}

}
