package pramp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {

	static void wordCountEngine(String document) {

		Map<String, Integer> wordCountMap = new HashMap<>();
		if (document != null) {
			String inputs[] = document.split(" ");
			if (inputs != null && inputs.length > 0) {
				for (String tmpStr : inputs) {
					tmpStr = tmpStr.toLowerCase();
					if (tmpStr != null && wordCountMap.get(tmpStr) != null) {
						int count = wordCountMap.get(tmpStr);
						wordCountMap.put(tmpStr, count + 1);
					} else if (tmpStr != null) {
						wordCountMap.put(tmpStr, 1);
					}
				}
			}
		}
		System.out.println(wordCountMap);
	}

	public static void main(String[] args) {

		//String document = "Cause I'm Slim Shady, yes I'm the real Shady, All you other Slim Shadys are just imitating So won't the real Slim Shady, please stand up, Please stand up, Please stand up";
		String document = "Look If you had One shot, Or one opportunity, To seize everything you ever wanted, In one moment, Would you capture it, Or just let it slip?";
		
		StringBuffer tmpBuffer = new StringBuffer();
		Map<String, Integer> countMap = new LinkedHashMap<>();
		int i = 0;
		for (char ch : document.toCharArray()) {
			i++;
			if (Character.isAlphabetic(ch) || Character.isWhitespace(ch) || (i == document.length())) {
				if (Character.isWhitespace(ch) || (i == document.length())) {
					// System.out.println(tmpBuffer);
					String tmpStr = tmpBuffer.toString().toLowerCase();
					if (countMap.get(tmpStr) != null) {
						int count = countMap.get(tmpStr);
						countMap.put(tmpStr, count + 1);
					} else {
						countMap.put(tmpStr, 1);
					}
					tmpBuffer = new StringBuffer();
				} else {
					tmpBuffer = tmpBuffer.append(ch);
				}
			}
		}

		TreeMap<Integer, LinkedList<String>> resultMap = new TreeMap<>();
		LinkedList<String> words;
		for (String word : countMap.keySet()) {
			int count = countMap.get(word);
			if (resultMap.get(count) != null) {
				words = resultMap.get(count);
				words.add(word);
				resultMap.put(count, words);
			} else {
				words = new LinkedList<>();
				words.add(word);
				resultMap.put(count, words);
			}
		}

		System.out.println(resultMap);
		String[][] resultArray = new String[countMap.size()][2];
		int row = 0;
		for (Integer key : resultMap.descendingKeySet()) {
			words = resultMap.get(key);
			for (String word : words) {
				resultArray[row][0] = word;
				resultArray[row][1] = key + "";
				row++;
			}

		}

		System.out.println(Arrays.deepToString(resultArray));

	}

	

}
