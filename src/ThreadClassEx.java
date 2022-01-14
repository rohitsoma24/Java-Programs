class ThreadClassEx extends Thread{  
public void run(){ 
	
	for(int i=0;i<10;i++){
System.out.println("thread is running..."+Thread.currentThread().getName());  
	}
	}  
public static void main(String args[]){  
	ThreadClassEx t1=new ThreadClassEx();  


	t1.start();
	

 }  
}  