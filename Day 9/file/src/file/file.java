package file;
import java.io.OutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class file {  
     public static void main(String args[]) throws IOException{    
    	File file =new File("C:/Ananya/Day 9/Ananya.txt");
    	byte a[]=new byte[10];
    	for(int i=0;i<a.length;i++)
    	{
    		int h=System.in.read();
    		a[i]=(byte)h;
    	}
    	FileOutputStream out=new FileOutputStream(file);
    	for(int i=0;i<a.length;i++)
    	{
    		out.write(a[i]);
    		System.out.print((char)a[i]);
    	}
    	out.close();
    	System.out.println("Done");
     }
}