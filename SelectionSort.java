package unit6;


// try making a digitalClock.
// It helps tons to understand the nested loop algorithm.
public class SelectionSort {
	
	static int arr1[] = {64, 25, 12, 22, 11};
	static int arr[] = {20, 30, 50, 40, 10};
	
	public static void main(String[] args) {
		
		int size = arr.length;
		// i < size-1 means  
		for(int i=0; i<size-1; i++) 
		{
			for(int j=i+1; j<size; j++)
			{
				if(arr[i] > arr[j])
				{
					// Python swap a, b = b, a
					// Other languages don't have tuple.
					// So needs elaborate swap this way.
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			for(int x : arr)
			{
				System.out.print(x + "\t");
			}
			System.out.println();
		}
	}
}	
