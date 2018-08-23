import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

class Solution {

  static String[][] wordCountEngine(String document) {
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
					} else if(tmpStr.length()>0) {
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
    return resultArray;

	}

  

  public static void main(String[] args) {
  String document = "Practice makes perfect. you'll only get Perfect by practice. just practice!";
  wordCountEngine(document);
  }

}