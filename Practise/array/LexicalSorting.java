package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LexicalSorting {

	public LexicalSorting() {
		// TODO Auto-generated constructor stub
	}

	public List<String> reorderLines(int logFileSize, List<String> logLines) {
		List<String> resultString = new ArrayList<>(logFileSize);
		Map<String, String> map = new TreeMap<>();
		for (String str : logLines) {
			String id = str.substring(0, str.indexOf(" "));
			String value = str.substring(str.indexOf(" "), str.length());
			boolean flag = true;
			for (char c : value.toCharArray()) {
				if (c != ' ' && !Character.isDigit(c)) {
					flag = false;
				}
			}
			if (flag) {
				resultString.add(str);
			} else {
				map.put(value, id);
			}
		}
		int i = 0;
		for (String key : map.keySet()) {
			String id = map.get(key);
			resultString.add(i, id + " " + key);
			i++;
		}
		System.out.println(resultString);
		return resultString;
	}

	public static void main(String[] args) {
		List<String> logLines = new ArrayList<>();
		logLines.add("t2 13 121 98");
		logLines.add("r1 box ape bit");
		logLines.add("b4 xi me nu");
		logLines.add("br8 eat nim did");
		logLines.add("w1 has uni gry");
		logLines.add("f3 52 54 31");

		List<String> resultList = new ArrayList<>();
		resultList.add("r1 box ape bit");
		resultList.add("br8 eat nim did");
		resultList.add("w1 has uni gry");
		resultList.add("b4 xi me nu");
		resultList.add("t2 13 121 98");
		resultList.add("f3 52 54 31");

		new LexicalSorting().reorderLines(logLines.size(), logLines);
	}

}
