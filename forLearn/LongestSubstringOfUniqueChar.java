package forLearn;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringOfUniqueChar {

	public static void main(String[] args) {
		int i = 0;
	    int j = 0;
	    Map<Character,Integer> cMap = new HashMap<>();
	    int max = 0;
		String s = "aabacbebebee";
	    int k = 3;
	    
	    char[] sCh = s.toCharArray();
	    
	    while(j < sCh.length) {
	    	cMap.compute(sCh[j], (a, v) -> (v == null) ? 1 : v + 1);
	    	
	    	if(cMap.size() == k) {
	    		max = Math.max(max, j - i + 1);
	    	}
	    	
	    	if(cMap.size() > k) {  // if question is for no repeating character the if(cMap.size() == (j - i + 1))
	    		while(cMap.size() > k) {
	    			cMap.put(sCh[i], cMap.get(sCh[i]) - 1);
	    			// if value is 0 of any key value have to remove the key
	    			if(cMap.get(sCh[i]) == 0)
	    				cMap.remove(sCh[i]);
	    			i++;
	    		}
	    	}
	    	j++;
	    	
	    }
	
	    System.out.println("Longest substring of k unique character is "+max);
   
	}

}
