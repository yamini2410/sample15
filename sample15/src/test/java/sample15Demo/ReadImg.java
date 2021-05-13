package sample15Demo;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImg {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ITesseract image=new Tesseract();
		
		try {
			
			String str=image.doOCR(new File("C:\\Users\\yaminii\\Desktop\\yamfile\\image1.jpeg"));
			System.out.println("Data from image is"+str);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception "+e.getMessage());
		}

	
	}

}
