class WorkerThread extends Thread
{
	 private String message;  
	    public WorkerThread(String s){  
	        this.message=s;  
	    }  
	     public void run() {  
	        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
	        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
	        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
	    }  
	    private void processmessage() {  
	        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
	    }  

}

class Test
{

	public static void main(String args[])
	{
		
		
		for(int i=0;i<10;i++)
		{
			 //Runnable worker = new WorkerThread("" + i);
			
			 //Thread t1 =new Thread(worker);
			
			//Here we are creating object of worker thread every time, 
			//because we can not start the thread more than once with same Object reference 
			WorkerThread t1 = new WorkerThread("" + i);
			
			 t1.start();
		}
	}
}