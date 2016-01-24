package zzsamples;

public class Test implements Runnable {
	static int count;
	Test() {
		count++;
	}

	@Override
	public void run() {
		System.out.println("Thread started "+count);

	}

}
