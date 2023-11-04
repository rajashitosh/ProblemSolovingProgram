package forLearn;

import java.util.HashMap;
import java.util.Map;

public class CountOfAnagramInString {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		Map<Character, Integer> countMap =  new HashMap<>();
		int ans = 0;

		String s = "aaaabaa";
		String str = "aaba";

		char[] sCh = s.toCharArray();
		char[] strCh = str.toCharArray();
		int k = strCh.length;

		for(int l = 0;l < k; l++) {
			if(countMap.containsKey(strCh[l])) {
				countMap.put(strCh[l], countMap.get(strCh[l]) + 1);
			}
			else {
				countMap.put(strCh[l],1);
			}
		}

		int count = countMap.size();

		while(j < sCh.length) {

			if(countMap.containsKey(sCh[j]) && countMap.get(sCh[j]) > 0) {
				countMap.put(sCh[j], countMap.get(sCh[j]) - 1);

				if(countMap.get(sCh[j]) == 0) {
					-- count;
				}

			}

			if(j - i + 1 == k) {
				if(count == 0) {
					ans++;
					if(countMap.containsKey(sCh[i])) {
						countMap.put(sCh[i], countMap.get(sCh[i]) + 1);
						count++;
					}
				}
				i++;
			}

			j++;

		}
		
		System.out.println("Count of Anagram "+ans);

	}

	
	// char to String String.valueOf(str.charAt(l))
}
