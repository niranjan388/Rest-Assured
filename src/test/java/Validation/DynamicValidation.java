package Validation;

import org.testng.annotations.Test;
import java.util.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class DynamicValidation 
{
	
	@Test
	public void dynamicvalidation()
	{ 
		
		//Dyanmicvalidationof actual=new Dyanmicvalidationof();
		boolean flag = false;
		RestAssured.baseURI="http://rmgtestingserver:8084/";
	//	actual.post();
		String exptedproject="TY_PROJ_11124";
		
		System.out.println(exptedproject);
		
		Response res = RestAssured.when().get("/projects");
		
		List<String> allIds = res.jsonPath().get("projectId");
		
	for (String string : allIds)
	{
		
		if (string.equals(exptedproject))
		{
			flag = true;
			RestAssured.when().get("/projects/"+string).then().log().all();
			break;
			
		}
		
		
	}
	
	
	Assert.assertTrue(flag);
	System.out.println("validated");
	}

}
