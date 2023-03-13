package Parser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.CreateProject;
import POJO.CreateProjectWithArray;



public class DeserlizationwithArray 
{
	@Test
	public void deser() throws JsonParseException, JsonMappingException, IOException
	{
		
		ObjectMapper omap=new ObjectMapper();
		
	
		CreateProjectWithArray enm = omap.readValue(new File("./jsonobjectArraay.json"), CreateProjectWithArray.class);
	System.out.println(enm.getTeamSize()[1]);	
	}

}
