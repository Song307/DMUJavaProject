//바이너리 파일 복사 ppt.31
package proj0327;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("d:\\grim1.jpg");
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			FileOutputStream fout = new FileOutputStream("d:\\grimcopy222.jpg");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			int c;
			while( (c = fin.read()) != -1) {
				bout.write( (byte)c );
			}
			fin.close();
			bin.close();
			
			bout.close();			
			fout.close();

			System.out.println("파일이 잘 복사되었어요~~");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
           System.out.println("파일이 없대요~~");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("읽다가 에러 났어요~~");
			e.printStackTrace();
		} catch (Exception e) {
			//TODO: handle exception
			System.out.println("기타 에러~~");
			e.printStackTrace();
		}

	}
}
