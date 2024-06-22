package proj0327;

import java.io.*;
	public class BlockBinaryCopyEx {
		public static void main(String[] args) {
			File src = new File("c:\\grim.jpg");
			File space = new File("c:\\Temp\\space.jpg");
			try {
				FileInputStream fi = new FileInputStream(src);
				FileOutputStream fo = new FileOutputStream(space);
				byte [] buf = new byte [1024*10];
				while(true) {
					int n = fi.read(buf);
					fo.write(buf, 0, n);
					if(n <buf.length)
						break;
				}
				fi.close();
				fo.close();
				System.out.println( src.getPath() + "를 " + space.getPath() +
						"로 복사하였습니다.");
			} catch (IOException e) { System.out.println("파일 복사 오류"); }
		}
}
