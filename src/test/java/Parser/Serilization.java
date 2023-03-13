package Parser;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenaricUtil.JavaUtil;
import POJO.CreateProject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import junit.framework.Assert;

public class Serilization 
{
	@Test
	public void createproject() throws JsonGenerationException, JsonMappingException, IOException
	{
		JavaUtil rdm=new JavaUtil();
		int ran = rdm.GetRandomNumber();
		
		//RestAssured.baseURI="http://rmgtestingserver:8084/";
		CreateProject createproject = new CreateProject("Niranjan", "Nj1234"+ran, "strted", 20);
		
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./jsonobject122.json"), createproject);
		
	}

}
