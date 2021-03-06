import java.util.Arrays;

/*
 *Consider the following two rules that are to be applied to an array of characters.
� Replace each 'a' by two 'd's.
� Delete each entry containing a 'b'.
For example, applying these rules to the array (a,c,d,b,b,c,a ) results in the array
(d, d, c, d c, d, d).

Write a program which takes as input an array of characters, and removes each 'b' and
replaces each 'a' by two 'd's. Specifically, along with the array, you are provided an
integer-valued size. Size denotes the number of entries of the array that the operation
is to be applied to. You do not have to worry preserving about subsequent entries. For
example, if the array is {a,b,a,c,J) and the size is 4, then you can return (d,d,d,d,c).
You can assume there is enough space in the array to hold the final result.

Hint: Consider performing multiples passes on s.

 */
public class CharRelacement {

	public static void main(String[] args) {
		char[] chars = { 'a', 'a', 'c', 'b', 'a', 'b', 'b' };
		System.out.println(Arrays.toString(chars));
		int writeIdx = 0;
		int aCount = 0;
		// Remove b from chars array.
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != 'b') {
				chars[writeIdx++] = chars[i];
			}

			if (chars[i] == 'a') {
				aCount++;
			}
		}

		int curIdx = writeIdx - 1;
		writeIdx = writeIdx + aCount - 1;
		int finalSize = writeIdx + 1;

		System.out.println(Arrays.toString(chars));

	}
}
