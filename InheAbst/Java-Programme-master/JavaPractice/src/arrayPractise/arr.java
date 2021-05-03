package arrayPractise;

public class arr {

	int [] t ;
	public static void main(String[] args) {

        int[] a = {10,20,30,40,50,60,70,80};
        arr h = new arr(a);
       	h.printArray(a);
	}

	arr(int[] intArray)
	{
		
		this.t= intArray;
		
	}
	 void printArray(int[] intArray)
	{
		for(int val: intArray)
			System.out.print(val + " ");
	}
	
	
	
}
