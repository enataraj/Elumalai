
public class RotateNumber {

	public RotateNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int num = 23456;
		int tt = num;
		int t = 0;
		int temp = num;
		while (temp != 0) {
			temp = temp / 10;
			t++;
		}

		System.out.println("size : " + t);

		int rem;
		int div;
		while (true) {
			rem = num % 10;
			div = num / 10;
			num = (int) ((Math.pow(10, t-1)) * rem) + div;
			System.out.println(num);
			if(num==tt){
				break;
			}
		}
	}

}
