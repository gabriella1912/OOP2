import java.util.Random;

public class ArrayProblem {

	public ArrayProblem() {
	}
	
	public static void main(String[] args) {
		
		int[] array= {0,0,0,0,0,0,0,0,0};
		Random randomizer = new Random();
		
		System.out.println("Initial Array: ");
		for (int i = 0; i < array.length; i++) {
			array[i]=randomizer.nextInt(100)+1;
			System.out.println(array[i]);
		}
		
		int value=array[0];
		
		System.out.println("Linear Search result: "+linearSearch(value,array));
		
		int[] sortedArray=sort(array);
		
		System.out.println("Sorted Array:");
		for (int i : sortedArray) {
			System.out.println(i);
		}
		
		System.out.println("Binary Search result:"+binarySearch(value,sortedArray,0,array.length));
		
		
	}

	private static int linearSearch(int value, int[] array) {
			
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]==value)
				return i;
		}
		return -1;
	}
	

	private static int[] sort(int [] array) {
		
		
		
		int min=0;
		for (int i = 0; i < array.length; i++) {
			min=i;
		for (int j = i+1; j < array.length; j++) {
			if (array[min]>array[j]) 
				min=j;
		}
		if (min!=i) {
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		}
		
			
		
		
		return array;
	}
	
	
	 private static int binarySearch(int searchedValue, int array[], int startValue, int endValue)
	    {
	        if (endValue>=startValue)
	        {
	            int midValue = startValue + (endValue - startValue)/2;
	 
	            if (array[midValue] == searchedValue)
	               return midValue;
	 
	            if (array[midValue] > searchedValue)
	               return binarySearch(searchedValue, array, startValue, midValue-1 );
	
	            return binarySearch(searchedValue, array, midValue+1, endValue );
	        }
	 
	        return -1;
	    }
	 
	 

}
