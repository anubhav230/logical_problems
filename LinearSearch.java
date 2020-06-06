package interview;

public class LinearSearch {
	
	public static void Linearsrch(int[] arr,int i) {
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]==i) {
				System.out.println("element is present at "+j+"th position in given array");
			}
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr= {4,5,2,8,9,67,34,98,23};
		
		Linearsrch(arr,4);

	}

}
