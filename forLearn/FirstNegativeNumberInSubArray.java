package forLearn;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberInSubArray {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		List<Integer> nevList = new ArrayList<>();
		List<Integer> returnList = new ArrayList<>();

		int[] arr = {12,-1,-7,8,-15,30,16,28};
		int k = 3;

		while(j < arr.length) {
			if(arr[j] < 0) {
				nevList.add(arr[j]);
			}

			if((j-i+1) == k) {
				if(nevList.isEmpty())
					returnList.add(0);
				else {
					returnList.add(nevList.get(0));
					if(arr[i] == nevList.get(0)) {
						nevList.remove(0);
					}
				}
				i++;
			}
			j++;

		}

		int[] returnArray = returnList.stream().mapToInt(Integer :: intValue).toArray();

		System.out.println("Array of first negative integer in sub array "+ returnList);
	}

}
