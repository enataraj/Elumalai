
public class SelfRestart {

	public SelfRestart() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			System.out.println("-----****** i am starting ****---------------");
			final ProcessBuilder builder = new ProcessBuilder("C:\\test.bat");
			builder.start();
			System.out.println("Started the annother process ....");
			System.exit(0);
			System.out.println("Elumalai");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
