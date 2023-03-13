package Parser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.CreateProject;
import POJO.CreateProjectWithArray;
import POJO.CreateProjectWithArraycomplex;
import POJO.Data;



public class DeserlizationwithArrayComplexArrayofObject 
{
	@Test
	public void deserler() throws JsonParseException, JsonMappingException, IOException
	{
		
		ObjectMapper omap=new ObjectMapper();
		
	
		CreateProjectWithArraycomplex enm = omap.readValue(new File("./jsonobjectArraayComplex.json"), CreateProjectWithArraycomplex.class);
	
		Data[] Dta = enm.getData();
		for (int i = 0; i < Dta.length; i++)
		{
			System.out.println(Dta[i].getName());
			System.out.println(Dta[i].getEmail());
			
			
		}
		
	
	
	
	
	}

}
