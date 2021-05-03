package arrayPractise;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {47, 7 , 28, 19,19, 8, 89, 2};
		int tmp = 0 ;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
			if (arr[i]>arr[j])
			{
				 
				 
				tmp = arr[i];  
				arr[i] = arr[j];  
				arr[j] = tmp;  
				 
			}
			
			}
			System.out.println(arr[i]);
		}
		
	}

}
