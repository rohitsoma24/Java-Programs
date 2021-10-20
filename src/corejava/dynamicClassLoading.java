package corejava;

/*In dynamic Class loading, a class is loaded at runtime,jvm dosent need to know where class is present
In static class loading, class is loaded instantiation is done at compile time, with new keyword
e.g dynamicClassLoading obj =new dynamicClassLoading();
*/
public class dynamicClassLoading {
	public static void main(String[] args) {
		
		try {
			Class obj = Class.forName("com.java.oops.Student");
			
			ClassLoader cLoader = obj.getClassLoader();
			
			System.out.println("Class = " + obj.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured"+e);
			e.printStackTrace();
		}
	}

}
