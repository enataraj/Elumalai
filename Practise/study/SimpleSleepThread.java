package study;

public class SimpleSleepThread extends Thread {
	
	String name;
	
	public SimpleSleepThread(String name){
		this.name = name;
	}

	public void run() {
		System.out.println(name+" I am executing ...");
		try {
			if(name.equals("Thread 1")){
			Thread.sleep(3000);
			}
			if(name.equals("Thread 2")){
				Thread.sleep(4000);
				}
			if(name.equals("Thread 3")){
				Thread.sleep(6000);
				}
		} catch (Exception e) {
			System.out.println(name+" Got an Interept");
		}
		System.out.println(name+" I am done..");
	}

}
