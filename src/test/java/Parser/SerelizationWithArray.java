package Parser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import GenaricUtil.JavaUtil;
import POJO.CreateProject;
import POJO.CreateProjectWithArray;

public class SerelizationWithArray 
{
	@Test
	public void seriliwitharray() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		JavaUtil rdm=new JavaUtil();
		int ran = rdm.GetRandomNumber();
		
		int[] teamsize= {30,40};
		
		
		//RestAssured.baseURI="http://rmgtestingserver:8084/";
		CreateProjectWithArray createproject = new CreateProjectWithArray("Niranjan", "Nj1234"+ran, "strted", teamsize);
		
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./jsonobjectArraay.json"), createproject);
		
	}
	
	

}
