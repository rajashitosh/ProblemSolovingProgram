package forLearn;

public class LargestSubArrayOfSum {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		int[] arr = {4,1,1,1,2,3,1,1,1,1,1};
		int k = 5;
		int sum = 0;
		int max = 0;
		
		while(j < arr.length) {
			
			sum = sum + arr[j];
			if(sum == k) {
				max = Math.max(max, j - i + 1);
			}
			
			if(sum > k) {
				while(sum > k) {
					sum = sum  - arr[i];
					i++;
				}
			}
			
			j++;
			
		}
		
		System.out.println("Largest sub array size "+max);
	}

}
