package arrayPractise;

public class twod extends TwoDim{

	int[][] g;
	
	twod(int[][] c) {
		super(c);
		TwoDim.demo2(c);
	}

	public static void main(String[] args) {
		int [][] g = {{4, 5, 5}, {3, 2, 1}, {6, 9, 8}};
		twod j= new twod(g);

	}

}
