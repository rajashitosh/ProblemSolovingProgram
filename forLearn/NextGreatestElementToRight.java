package forLearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreatestElementToRight {

	public static void main(String[] args) {

		int[] arr = {1,3,2,4};
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> ansList = new ArrayList<>();

		for(int i = arr.length - 1; i >= 0; i--) { // for next greatest element for left for(int i = 0; i < arr.length - 1; i++)

			if(stack.empty())
				ansList.add(-1);
			else if(!stack.empty() && stack.peek() > arr[i])
				ansList.add(stack.peek());
			else if(!stack.empty() && stack.peek() < arr[i]) {
				while(!stack.empty() && stack.peek() < arr[i]) {
					stack.pop();
				}
				if(stack.empty())
					ansList.add(-1);
				else
					ansList.add(stack.peek());
			}
			stack.push(arr[i]);
		}
		
		Collections.reverse(ansList); // not need in case of NGL
		
		System.out.println("Next greatest element to right ans " + ansList);

	}

}
