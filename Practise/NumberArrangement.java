import java.util.Arrays;

/* lets say you have an unsorted list
// [9, 1, 3, 4, 6, 2, 5]
             r
             l
// grab the last element, and make it so that everything less than it goes on the left of the array, and 
// everything greater goes on the right side of the array
// [1, 3, 4, 2, 5, 9, 6]
// constraints: must be in place (meaning we cannot allocate new arrays, we must modify the existing array)

*/
public class NumberArrangement {

	public static void main(String[] args) {
		Integer[] input = { 19, 1, 13, 4, 6, 2, 5, 10,20,4,5,12,9 };
		int last = input[input.length - 1];
		int right = input.length - 2;
		int left = 0;
		while (left < right) {
			if (input[left] > last) {
				if (input[right] < last) {
					int temp = input[left];
					input[left] = input[right];
					input[right] = temp;
				} else {
					right--;
				}

			} else {
				left++;
			}

			if (left == right) {
				int temp = input[right];
				input[right] = last;
				input[input.length - 1] = temp;
			}

			System.out.println("Left : " + left + " Right " + right + " Input " + Arrays.asList(input));

		}

	}

}
