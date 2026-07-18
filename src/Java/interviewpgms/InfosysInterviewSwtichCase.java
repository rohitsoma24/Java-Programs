// in java switch, if a case does not have break, the flow goes to next case
// this is called "fall over"
package Java.interviewpgms;

public class InfosysInterviewSwtichCase {
	
	public static void main(String args[]) {
	
	for(int i=0;i<3;i++)
	{
		switch(i) {
		
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		}
	}
	}
}
