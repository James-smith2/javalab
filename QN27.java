
public class QN27 {
	
	public static void main(String[] args) {
		
		int arr[] = {2,436,62,6,456,3};
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second greatest number is: " + arr[1]);
		
	}

}
