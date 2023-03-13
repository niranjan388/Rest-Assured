package Parser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.CreateProject;



public class Deserlization 
{
	@Test
	public void deser() throws JsonParseException, JsonMappingException, IOException
	{
		
		ObjectMapper omap=new ObjectMapper();
		
	//	CreateProject enm = omap.readValue("./jsonobject122.json", CreateProject.class);
	 CreateProject enm = omap.readValue(new File("./jsonobject122.json"), CreateProject.class);
	System.out.println(enm.getProjectName());	
	}

}
