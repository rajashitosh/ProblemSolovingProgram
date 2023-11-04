package forLearn;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {

		Stack<SimpleEntry<Integer, Integer>> stack = new Stack<>();

		int[] arr = {100,80,60,70,60,75,85};
		List<Integer> intermediateAnsList =  new ArrayList<>();
		List<Integer> ansList =  new ArrayList<>();

		for(int i = 0; i < arr.length; i++) {

			if(stack.isEmpty())
				intermediateAnsList.add(-1);

			else if(!stack.isEmpty() && stack.peek().getKey() > arr[i]) 
				intermediateAnsList.add(stack.peek().getValue());

			else if(!stack.isEmpty() && stack.peek().getKey() < arr[i]) {

				while(!stack.isEmpty() && stack.peek().getKey() < arr[i])
					stack.pop();

				if(stack.isEmpty())
					intermediateAnsList.add(-1);
				else
					intermediateAnsList.add(stack.peek().getValue());
			}

			stack.push(new SimpleEntry<Integer, Integer>(arr[i], i));

		}
		
		for(int i = 0; i < intermediateAnsList.size(); i++) {
			ansList.add(i - intermediateAnsList.get(i));
		}
		
		System.out.println("Stock span problem " + ansList);

	}

}
