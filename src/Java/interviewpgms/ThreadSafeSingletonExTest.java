package Java.interviewpgms;

class ThreadSafeSingletonEx {
	
	static ThreadSafeSingletonEx instance;
	
	private ThreadSafeSingletonEx(){
		
	}
	
	//to make Sinleton class ThreadSafe, we can either make this method as synchronized
	static ThreadSafeSingletonEx getThreadSafeSingletonExInstance() {
		if (instance == null) {
			//or we can write a synchronized block here
			synchronized (instance) {
				if (instance == null) {
					instance = new ThreadSafeSingletonEx();
				}
				
			}
		}
		return instance;
	}

}

class ThreadSafeSingletonExTest{
	
	public static void main(String[] args) {
		
		ThreadSafeSingletonEx t1=ThreadSafeSingletonEx.getThreadSafeSingletonExInstance();
		
		System.out.println(t1.hashCode());
		
		ThreadSafeSingletonEx t2=ThreadSafeSingletonEx.getThreadSafeSingletonExInstance();
		
		System.out.println(t2.hashCode());
		
		
	}
	
	
}
