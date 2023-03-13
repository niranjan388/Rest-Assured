package Parser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import GenaricUtil.JavaUtil;
import POJO.CreateProject;
import POJO.CreateProjectWithArray;
import POJO.CreateProjectWithArraycomplex;
import POJO.CreateProjectWithObject;
import POJO.Data;

public class SerelizationWithObject 
{
	@Test
	public void seriliwitharray() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		JavaUtil rdm=new JavaUtil();
		int ran = rdm.GetRandomNumber();
		
		int[] teamsize= {30,40};
		
		Data obj =new Data("Niranjan","nj@gmail.com");
		
		
		
		//RestAssured.baseURI="http://rmgtestingserver:8084/";
		CreateProjectWithObject createproject = new CreateProjectWithObject("Niranjan", "Nj1234"+ran, "strted", teamsize,obj);
		
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./jsonobjectArraayObject.json"), createproject);
		
	}
	
	

}
