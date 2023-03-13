package CURDWITHOUTBDD;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetSingleProjects
{
	@Test
	public void PostTheRequest()
	{
		
		
		
		
		RequestSpecification req = RestAssured.given();
		

		  Response res = req.get("http://rmgtestingserver:8084/projects/TY_PROJ_16128");
		   int Statuscode=res.getStatusCode();
		   Assert.assertEquals(200, Statuscode);
		   System.out.println(res.asPrettyString());
		  
		  
	}

}
