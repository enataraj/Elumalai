import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution3
{ 
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<String> reorderLines(int logFileSize, List<String> logLines) 
	{
		// WRITE YOUR CODE HERE
		
		if(logFileSize<=0){
            return Collections.EMPTY_LIST;
        }
        
        Map<String,String> map = new TreeMap<>();
        List<String> resultList = new ArrayList<>();
		
		for(String str :logLines ){
		    String tmpStr= str.replaceAll("\\s+","");
		    map.put(tmpStr,str);
		}
	  
	   for(String str : map.keySet() ){
	       resultList.add(map.get(str));
	   }
	return resultList;
	}
	// METHOD SIGNATURE ENDS
}