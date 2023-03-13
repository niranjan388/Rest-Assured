package Parser;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import GenaricUtil.JavaUtil;
import POJO.CreateProjectWithArraycomplex;
import POJO.Data;

public class SerelizationWithArrayComplex 
{
	@Test
	public void seriliwitharray() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		JavaUtil rdm=new JavaUtil();
		int ran = rdm.GetRandomNumber();
		
		int[] teamsize= {30,40};
		
		Data[] obj = {new Data("Niranjan","Niranjan@gmail"),new Data("Arun","Arun@gmail"),new Data("Pavan","Pavan@gmail")};
		
		
		
		//RestAssured.baseURI="http://rmgtestingserver:8084/";
		CreateProjectWithArraycomplex createproject = new CreateProjectWithArraycomplex("Niranjan", "Nj1234"+ran, "strted", teamsize,obj);
		
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./jsonobjectArraayofObject.json"), createproject);
		
	}
	
	

}
