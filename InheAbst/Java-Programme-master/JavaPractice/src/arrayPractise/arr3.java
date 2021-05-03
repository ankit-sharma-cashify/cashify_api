package arrayPractise;

public class arr3 {
	
	int [][] v;
	
	arr3(int [][] p)
	{
		this.v = p;
		
	}

	public static void main(String[] args) {
		int[][] f = {{3, 4, 5}, {4,6,7}};
		arr3 u = new arr3(f);
		u.arrayprint();
	}
	
	public void arrayprint()
	{
		int[][] a= { {10,20}, {50, 60}};
		
		for (int i =0; i <a.length;i++)
		{
			for (int j=0;j<a.length;j++)
				System.out.print(a[i][j]+ "\t");
			System.out.println(" ");
		}
		
	}			


}
