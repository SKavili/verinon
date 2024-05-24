package com.verinon.core.io;
import java.io.*;

public final class FileReader {
    public static void main(String[] args) {

        try {

                   System.out.print("testing \n");
                   System.out.println("second \t line");

                FileOutputStream fos = new FileOutputStream(new File("//home//ubuntu//java//text.txt"));

                String txt = "File Operations";

                byte b1[] = txt.getBytes();
                fos. write(b1);
                fos.close();

            FileInputStream fis = new FileInputStream(new File("//home//ubuntu//java//text.txt"));
            byte[] b = new byte[1024];


            fis.read(b);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException  e) {
            
            e.printStackTrace();
        }catch (IOException e) {

        }
        
    }
}