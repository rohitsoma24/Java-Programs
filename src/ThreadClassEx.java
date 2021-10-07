class ThreadClassEx extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
	ThreadClassEx t1=new ThreadClassEx();  
t1.start();  
 }  
}  