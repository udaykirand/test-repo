package zzsamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ExecDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService exec = Executors.newFixedThreadPool(10);
		for(int i = 0; i < 100; i++) {
			Runnable test = new Test();
			exec.submit(test);
		}
		exec.shutdown();
		exec.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
	}

}
