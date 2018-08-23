import java.util.Arrays;

import tobesolved.MyUtil;

public class OptimalSolution {
	
	 public static int leastInterval(char[] tasks, int n) {

	        int[] c = new int[26];
	        for(char t : tasks){
	            c[t - 'A']++;
	        }
	        Arrays.sort(c);
	        MyUtil.printArray(c);
	        int i = 25;
	        while(i >= 0 && c[i] == c[25]) i--;
	        MyUtil.printArray(c);
	        return Math.max(tasks.length, (c[25] - 1) * (n + 1) + 25 - i);
	    }
	 
	 public static void main(String[] args) {
		char[] input = {'A','B','C','A','A'};
		int time = leastInterval(input,3);
		System.out.println("Time :"+time);
	}
	 
	

}
