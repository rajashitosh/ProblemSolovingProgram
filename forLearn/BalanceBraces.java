package forLearn;

import java.util.*;
class BalanceBraces{
	
	public static void main(String []argh)
	{
        try{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			Stack s = new Stack<>();
			String input=sc.next();
            for (int j = 0; j < input.length(); j++) {
            	Character top = '.';
            	if(!s.empty())
            	 top = (char)s.peek();
                
                
                if(top == '{' && input.charAt(j) == '}' || top == '(' && input.charAt(j) == ')' || top == '[' && input.charAt(j) == ']'){
                    s.pop();
                }
                else {
                	s.push(input.charAt(j));
                }
                
            }
            if(s.empty())
            System.out.println(true);
            else
            System.out.println(false);
            
		}
		
	}
    catch(Exception e){
        
    }
    }
    
}