package forLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextSmallestNumberToLeft {

	public static void main(String[] args) {
		
		int[] arr = {4,5,2,10,8};
		Stack<Integer> stack = new Stack<>();
		List<Integer> ansList =  new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(stack.isEmpty())
				ansList.add(-1);
			else if(!stack.isEmpty() && stack.peek() < arr[i])
				ansList.add(stack.peek());
			else if(!stack.isEmpty() && stack.peek() > arr[i]) {
				while(!stack.isEmpty() && stack.peek() > arr[i])
					stack.pop();
				if(stack.isEmpty())
					ansList.add(-1);
				else
					ansList.add(stack.peek());
			}
			
			stack.push(arr[i]);
			
		}
		
		System.out.println("Next smallest element to left " + ansList);
	}

}
