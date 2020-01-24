package Fichier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ClassFile {

public static void main(String[] args) throws IOException {
		File monfichier = new File("C:\\Users\\hp\\Desktop\\note2.txt");
//		try {
//			Scanner sc = new Scanner(monfichier);
//			while (sc.hasNextLine()) {
//				String text = sc.nextLine();
//				System.out.println(text);
			monfichier.createNewFile();
		System.out.println(monfichier.exists());	
//	} catch (FileNotFoundException e) {		
//		e.printStackTrace();
//}
		File f = monfichier.getParentFile();
		System.out.println(f.toString());
	     
}

    private static void listefichier(File f) {
    	
    	if (f.isDirectory()==true) {
    		String fichier []=f.list();
    		System.out.println(f.getAbsolutePath()+":");
    		for(int i=0; i!=fichier.length ; i++) {
    			System.out.println("C:\\Users\\hp\\Desktop\\cours java" + fichier[i]);	
    		}
    } else { System.err.println( f + "n'est pas un repertoire");
    	
    }
    
    	
    
    
    
    }
    
    







}
