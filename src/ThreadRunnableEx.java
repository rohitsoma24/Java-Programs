class ThreadRunnableEx implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
	ThreadRunnableEx m1=new ThreadRunnableEx();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}  
