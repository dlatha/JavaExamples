package javaexamples.multithreading;

public class ThreadBeginner implements Runnable{

	public static void main(String[] args) {
		ThreadBeginner tb = new ThreadBeginner();
		Thread t = new Thread(tb);
		t.start();
		
	}

	public void run() {
		System.out.println("Runnable thread");
	}

}
