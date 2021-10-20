package ExceptionsDemos;

import java.io.*;


//Checked exceptions are those exceptions which are known to compiler
//Here we we save the file it tells us to handle the IOException
class IOChekced {
	public static void main(String[] args) {
		FileReader file = new FileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++)
			System.out.println(fileInput.readLine());
		
		fileInput.close();
	}
}

