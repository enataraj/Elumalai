// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution1
{        
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    private static List<String> retrieveMostFrequentlyUsedWords(String literatureText, 
                                                 List<String> wordsToExclude)
    {        
    	LinkedList<String> ll = new LinkedList<>();
        Map<String,Integer> wordMap = new HashMap<>();
        String[] inputs = null;        
        if(literatureText!=null && literatureText.length()>0){
           inputs = literatureText.split(" ");
        }else{
            return Collections.EMPTY_LIST;
        }       
        
        for(String finalWord :inputs){
                if(!(wordsToExclude!=null && wordsToExclude.contains(finalWord))){
                    if(wordMap.get(finalWord)!=null){
                        Integer count = wordMap.get(finalWord);
                        wordMap.put(finalWord,count+1);
                    }else {
                        wordMap.put(finalWord,1);
                    }
                }
            }        
        
       TreeMap<Integer, LinkedList<String>> resultMap = new TreeMap<>();
       LinkedList<String> words ;
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
 
    
    // METHOD SIGNATURE ENDS
    
    public static void main(String[] args) {
		String str = "rose is flower is pond";
		List<String> list = new ArrayList<>();
		list.add("rose");
		list.add("is");
		
		List<String> result = new Solution1().retrieveMostFrequentlyUsedWords(str,list);
		System.out.println(result);
		
	}
}