import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderExample {

	public static void readFile(String fileName) {

		try {

			// File is small and want to read whole content go for File Reader
			// If you want to go line by line go for BufferedReader

			// Using Buffer Reader
			FileReader reader = new FileReader(fileName);
			BufferedReader brReader = new BufferedReader(reader);
			String line = brReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = brReader.readLine();
			}

			System.out.println("******************************************************");
			
			// Using Scanner
			Scanner scan = new Scanner(new File(fileName));
			while (scan.hasNextLine()) {
				line = scan.nextLine();
				System.out.println(line);
			}
			
			System.out.println("*******************************************************************");
			
			// Using File Input Stream
			
			FileInputStream fis = new FileInputStream(new File(fileName));
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			while(dis.available()!=0){
				line = dis.readLine();
				System.out.println(line);
			}

		} catch (Exception e) {
			System.out.println("Exception while reading file");
		}
		
		
		

	}

	public static void main(String[] args) {
		String filePath = "C:\\Project\\Code\\Cloupia\\src\\FileReaderExample.java";
		readFile(filePath);
	}

}
