
/*
 * Given an input stream of n integers the task is to insert integers to stream and print the kth largest element in the stream at each insertion.
 * 
 * 

Explaining the sample example given in the question itself :
Input:
stream[] = {10, 20, 11, 70, 50, 40, 100, 5, ...}
k = 3

start - input is 10. so far no 3rd largest no. available so output is -1.
next i/p = 20. again print -1.
next i/p =11. now among 10,20 and 11 3rd largest is 10 so print 10.
next i/p = 70. now among all numbers received, 3rd largest is 11 so print 11.
and so on.

 */

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestNumber {

	public static void main(String[] args) {
		System.out.print("Number of Input : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.print("Kth Largest : ");
		int kthLargest = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < input; i++) {
			System.out.print("Enter " + i + " th Input :");
			int value = sc.nextInt();
			System.out.println("Values : " + value);
			set.add(value);
			System.out.println(set);
			int index = set.size() - kthLargest;
			if (index >= 0) {
				Iterator itr = set.iterator();
				int count = 0;
				while (itr.hasNext()) {
					if (index == count) {
						System.out.println("Result : " + itr.next());
						break;
					} else {
						itr.next();
						count++;
					}
				}

			} else {
				System.out.println("-1");
			}
		}

	}

}
