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



public class DeserlizationwithArrayComplex 
{
	@Test
	public void deserler() throws JsonParseException, JsonMappingException, IOException
	{
		
		ObjectMapper omap=new ObjectMapper();
		
	
		CreateProjectWithArraycomplex enm = omap.readValue(new File("./jsonobjectArraayComplex.json"), CreateProjectWithArraycomplex.class);
	System.out.println(enm.getTeamSize()[0]);
	
	
	
	//System.out.println(enm.getData().getEmail());
	//System.out.println(enm.getData().getName());
	}

}
