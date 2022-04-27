package Session1;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class file {

	public static void main(String[] args){
		try {
			FileReader f= new FileReader("C:\\\\Users\\\\abhi\\\\OneDrive\\\\Desktop\\\\java.txt");
			try {
				int i;
				while((i=f.read())!=-1) {
					System.out.println((char)i);
					
				}
			}
			finally {
				f.close();
			}
			System.out.print("true");
			
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		

	}

}
