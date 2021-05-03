package arrayPractise;

public class TwoDim {
	int [][] x;
	
	TwoDim(int[][] o)
	{
		this.x= o;
	}
	
	public static void main(String[] args) {

		int [][] p = {{4, 5, 5}, {3, 2, 1}, {6, 9, 8}};
	
		TwoDim.demo2(p);
	}
	
	public static void demo2(int [][] k)
	{
		for (int i = 0; i<k.length; i++)
		{
			for (int j = 0; j<k.length; j++)
			{
				System.out.print(k[i][j]+ "\t");
			}
			System.out.println(" ");
		}
	}
	
	

}
