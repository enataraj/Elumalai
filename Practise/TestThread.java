
public class TestThread extends Thread {
	public void run() {
		try {
			System.out.println("I m gng to sleep ...");
			Thread.sleep(4000);
			System.out.println("i am completed my sleep ...");
		} catch (Exception e) {
			System.out.println("Exception e "+e);
		}
		
		if(Thread.interrupted()){
			System.out.println("Hay Dude i am interrupted ..");
		}
	}

}
