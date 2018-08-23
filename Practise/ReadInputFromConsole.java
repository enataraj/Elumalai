import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInputFromConsole {

	public static void bufferReader() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name : ");
			String s = br.readLine();
			System.out.println("Enter Age :");
			int i = Integer.parseInt(br.readLine());
			System.out.println("String : " + s);
			System.out.println("Integer :" + i);
		} catch (Exception e) {
			System.err.println("Error : " + e);
		}
	}

	public static void readScanner() {
		System.out.println("Reading Console Input");
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Number :");
		int intVa = reader.nextInt();
		System.out.println("Read Value " + intVa);
		System.out.println("Enter String :");
		String str = reader.next();
		System.out.println("String " + str);
		reader.close();

	}

	public static void main(String[] args) {
		//readScanner();
		bufferReader();
	}

}
