package Thread.demos;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolEx {
	
	public static void main(String[] args) {
		
	
		ScheduledThreadPoolExecutor STP = new ScheduledThreadPoolExecutor(2); 
	
	Runnable task1= new Command("Task1");
	Runnable task2 = new Command("Task2");
	
	for(int i=0;i<10;i++)
	{	
	STP.schedule(task1,2,TimeUnit.SECONDS);
	
	STP.schedule(task2, 5, TimeUnit.SECONDS);
	}
	
	STP.shutdown();


	}
}

class Command implements Runnable{

	public String msg;
		
	public Command(String msg)
	{
		this.msg=msg;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Task Name  " + this.msg + "  Current Time" + Calendar.getInstance().get(Calendar.SECOND));
		
	}}