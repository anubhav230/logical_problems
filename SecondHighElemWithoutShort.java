package interview;

public class SecondHighElemWithoutShort {
	
	
	public static void secondHighest(int[] arr) {
		
		int highest=Integer.MIN_VALUE;
		int sechighest=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>highest) {
				sechighest=highest;
				highest=arr[i];
				}
			if (arr[i]<highest && arr[i]>sechighest) {
				
				sechighest=arr[i];
				
			}
			
			
		}
		System.out.println("second highest element is "+sechighest);
	}

	public static void main(String[] args) {
		int[] arr= {3,7,6,1,56,23,78,23,56,34,34,9,1};
		secondHighest(arr);
	}

}
