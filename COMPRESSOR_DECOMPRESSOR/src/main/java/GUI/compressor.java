/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Bholanath Patra
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;


public class compressor {
    public static void method(File file) throws IOException{
        String filedirectory=file.getParent();
        
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(filedirectory +"Compressed1.gz");
        GZIPOutputStream gzip=new GZIPOutputStream(fos);
        
        byte []buffer=new byte[1024];
        int len;
        
        while((len=fis.read(buffer))!=-1){
            gzip.write(buffer,0,len);
        }
        
        gzip.close();
        fos.close();
        fis.close();
        
    }
    public static void main(String [] args) throws IOException
    {
        File path=new File("C:\\Users\\cw\\Desktop\\compressorDecompressor\\hello.txt");
        method(path);
    }
}