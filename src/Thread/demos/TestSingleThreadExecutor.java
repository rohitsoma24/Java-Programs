package Thread.demos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleThreadExecutor {
	
	public static void main(String[] args) {
	
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		Runnable rn = new SingleWorkerThread();
		
		ex.execute(rn);
		
		ex.shutdown();
		
		System.out.println("Executor is closed");
	}
}
