//FileReader로 텍스트 파일 읽기 ppt. 11

package proj0327;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fin = new FileReader("c:\\song.txt");
			BufferedReader bin = new BufferedReader(fin);
			int c;
			while (( c= fin.read()) != -1 ) {
				System.out.print( (char)c );
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exceptions
			System.out.println("None read file");
		} catch (IOException e) {
			// TODO: handle exceptions
			System.out.println("error");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("another error");
		}
		
	}

}

