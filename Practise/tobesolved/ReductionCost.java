package tobesolved;

public class ReductionCost {

	// 1,2 ,3,4 
	// 3,4,3 ->3
	// 3,7 -> 7
	// 10
	static int resuctionCost(int[] num) {

		int sum = 0;
		if (num.length > 1) {
			sum = num[0] + num[1];
			System.out.println("Sum : " + sum);

			int res[] = new int[num.length - 1];
			for (int i = 0; i < res.length; i++) {
				if ((i + 2) < num.length) {
					res[i] = num[i + 2];
				}
			}

			res[res.length - 1] = sum;

			MyUtil.printArray(res);

			return sum+resuctionCost(res);
		}
		return 0;
		// int res = resuctionCost(res);

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3,4,5};
		int result = resuctionCost(a);
		System.out.println("Result : " + result);
	}

}
