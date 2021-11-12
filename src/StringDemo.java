
public class StringDemo {
	
		public static void main(String[] args) {
			
			/*whenever we try to add anything to a existing String, then new String Object/reference will be created with
			new string value, original String value will remain as it is*/
			String s1= "MyString";
			
			System.out.println(s1 +"    Object Hashcode "+ s1.hashCode());
			
			s1=s1+"Fuck";
			
			System.out.println(s1 +"    Object Hashcode "+ s1.hashCode());
			
			String s2=s1.concat("Me");
			
			System.out.println(s2 +"    Object Hashcode "+ s1.hashCode());
		
			
			/*Sting Concatination works from left to right
			i.e if String is provided at leftmost, it will take all other variables provided at right side as String*/
			int a=10, b=20;
			
			System.out.println(a+b+"Hello");
			
			System.out.println("Hello"+a+b);
		}
}
