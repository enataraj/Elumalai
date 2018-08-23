package tobesolved;

public class MyUtil {

	public static void printArray(int[] a) {
		{
			System.out.println("Content in Array : ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();
			for (int i = 0; i < a.length; i++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

	public static void printArray(Integer[] a) {
		{
			System.out.println("Content in Array : ");
			for (int i = 0; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();
		}
	}

	public static SingleNode createLinkedList() {

		SingleNode head = new SingleNode();
		head.data = 50;
		head.next = null;

		return head;

	}

}
