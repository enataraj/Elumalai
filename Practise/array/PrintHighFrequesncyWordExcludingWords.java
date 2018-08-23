package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrintHighFrequesncyWordExcludingWords {

	public PrintHighFrequesncyWordExcludingWords() {
		// TODO Auto-generated constructor stub
	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	private static List<String> retrieveMostFrequentlyUsedWords(String literatureText, List<String> wordsToExclude) {
		Map<String, Integer> wordMap = new HashMap<>();
		String[] inputs = null;
		if (literatureText != null && literatureText.length() > 0) {
			inputs = literatureText.split(" ");
		} else {
			return Collections.EMPTY_LIST;
		}

		for (String finalWord : inputs) {
			if (!(wordsToExclude != null && wordsToExclude.contains(finalWord))) {
				if (wordMap.get(finalWord) != null) {
					Integer count = wordMap.get(finalWord);
					wordMap.put(finalWord, count + 1);
				} else {
					wordMap.put(finalWord, 1);
				}
			}
		}

		TreeMap<Integer, LinkedList<String>> resultMap = new TreeMap<>();
		LinkedList<String> words;
		for (String word1 : wordMap.keySet()) {
			int count = wordMap.get(word1);
			if (resultMap.get(count) != null) {
				words = resultMap.get(count);
				words.add(word1);
				resultMap.put(count, words);
			} else {
				words = new LinkedList<>();
				words.add(word1);
				resultMap.put(count, words);
			}
		}

		Integer key = resultMap.keySet().iterator().next();
		return resultMap.get(key);

	}

	private static List<String> retrieveMostFrequentlyUsedWordsWithOptimization(String literatureText,
			List<String> wordsToExclude) {
		Map<String, Integer> wordMap = new HashMap<>();
		if (literatureText == null || literatureText.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		int maxCount = 0;

		for (String finalWord : literatureText.split(" ")) {

			if (finalWord != null && !finalWord.isEmpty()) {

				if (!(wordsToExclude != null && wordsToExclude.contains(finalWord))) {
					if (wordMap.get(finalWord) != null) {
						Integer count = wordMap.get(finalWord);
						count += 1;
						wordMap.put(finalWord, count);
						if (count > maxCount) {
							maxCount = count;
						}
					} else {
						wordMap.put(finalWord, 1);
						if (maxCount < 1) {
							maxCount = 1;
						}
					}
				}
			}
		}

		System.out.println(wordMap);

		List<String> resultList = new ArrayList<>();
		for (String word1 : wordMap.keySet()) {
			if (maxCount == wordMap.get(word1)) {
				resultList.add(word1);
			}
		}

		return resultList;
	}

	// METHOD SIGNATURE ENDS

	public static void main(String[] args) {
		String str = "rose is a flower rose is pond a pond flower rose flower in garden garden garden pond";
		List<String> list = new ArrayList<>();
		list.add("rose");
		list.add("is");
		list.add("a");

		List<String> result;
		result = retrieveMostFrequentlyUsedWordsWithOptimization(str, list);
		System.out.println(result);

//		result = retrieveMostFrequentlyUsedWords(str, list);
//		System.out.println(result);

	}

}
