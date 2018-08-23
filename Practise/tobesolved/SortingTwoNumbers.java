package tobesolved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTwoNumbers {

	public static void sortAyyays(int[] a, int[] b) {
		List<Numbers> numbersList = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			numbersList.add(new Numbers(a[i], i, "First"));
		}

		for (int i = 0; i < b.length; i++) {
			numbersList.add(new Numbers(b[i], i, "Second"));
		}

		Collections.sort(numbersList);
		;
		for (int i = 0; i < numbersList.size(); i++) {
			System.out.println(numbersList.get(i));
		}

	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 5, 3, 65, 32, 2 };
		int b[] = { 4, 4, 5, 2, 6, 2, 5 };
		sortAyyays(a, b);

	}

}

class Numbers implements Comparable<Numbers> {
	int num;
	int index;
	String arrayName;

	public Numbers(int num, int index, String arrayName) {
		this.num = num;
		this.index = index;
		this.arrayName = arrayName;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getArrayName() {
		return arrayName;
	}

	public void setArrayName(String arrayName) {
		this.arrayName = arrayName;
	}

	@Override
	public int compareTo(Numbers number) {
		if (this.num > number.num) {
			return 1;
		} else if (this.num < number.num) {
			return -1;
		}

		return 0;
	}

	@Override
	public String toString() {
		return "Number : " + this.num + " Index : " + this.index + " ArrayName :" + this.arrayName;
	}

}