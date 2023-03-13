package Validation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Staticvalidation
{
	
	@Test
	public void staticvalidation()
	{
		RestAssured.baseURI="http://rmgtestingserver:8084/";
		String exptedproject="TY_PROJ_11111";
		
		Response res = RestAssured.when().get("/projects");
	
		
		 String actdata = res.jsonPath().get("[0].projectId");
		res.then().statusCode(200); 
		Assert.assertEquals(exptedproject, actdata);
	   System.out.println("Validated the data");	
		
	}

}

