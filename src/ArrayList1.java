import java.util.*;    
class ArrayList1{    
 public static void main(String args[]){    
     
  List<Integer> al=new ArrayList<Integer>();//creating arraylist    
  al.add(1);//adding object in arraylist    
  al.add(11);    
  al.add(20);    
  al.add(2);    
  //traversing elements using Iterator  
  
  int[] a= new int[al.size()];
  
  for(int i=0;i<al.size();i++)
  {
	  a[i]=al.get(i);
	  
  }
  
  for(int i=0;i<al.size();i++)
  {
	  System.out.println(a[i]);
  }
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }    
 }    
}   