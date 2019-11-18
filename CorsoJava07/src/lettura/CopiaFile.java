package lettura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaFile {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("lisbona.jpg");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\teacher\\Desktop\\lisbona_cp.jpg");
			
			int c;
			
			while (  (c = fis.read()) != -1  ) {
				fos.write(c);
			}
			fos.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
