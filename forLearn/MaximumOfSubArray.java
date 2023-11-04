package forLearn;

import java.util.ArrayList;
import java.util.List;

public class MaximumOfSubArray {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		List<Integer> returnList = new ArrayList<>();
		
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int max = arr[0];
		
		while(j < arr.length) {
			max = Math.max(max, arr[j]);
			
			if(j - i + 1 == k) {
				returnList.add(max);
				if(max == arr[i])
					max = arr[j];
				i++;
			}
			
			j++;
			
		}
		
		System.out.println("Maximun number in sub array "+ returnList);
		
	}

}
