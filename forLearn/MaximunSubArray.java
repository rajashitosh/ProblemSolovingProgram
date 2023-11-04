package forLearn;

public class MaximunSubArray {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int[] arr = {2,3,5,-7,3,2,10,6};
		int k = 3;
		int max = arr[0];
		while(j < arr.length) {

			// calculation
			sum =  sum + arr[j];

			// getting size of sliding window
			if((j-i+1) == k) {
				max = Math.max(max, sum);
				// reducing previous one
				sum = sum - arr[i];
				i++;
			}
          j++;
		}

		System.out.println("Maximun sum of sub array "+max);

	}

}
