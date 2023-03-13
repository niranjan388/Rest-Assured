package Parser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.testng.annotations.Test;

public class Serilizatio
{
	@Test
	public void serli() throws IOException
	{
		EmpDetails empd=new EmpDetails("Niranjan", "QA", "Bangalore");
		
		FileOutputStream fis=new FileOutputStream("./newFile");
		
		ObjectOutputStream fout=new ObjectOutputStream(fis);
		
		fout.writeObject(empd);
		fout.close();
		fis.close();
		
		printdata(empd);
		
		
		
	}
	
	public  void printdata(Object empd)
	{
	  
		
		
	}
	

}
