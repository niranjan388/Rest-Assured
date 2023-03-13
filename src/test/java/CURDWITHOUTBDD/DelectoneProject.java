package CURDWITHOUTBDD;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DelectoneProject
{
	@Test
	public void PostTheRequest()
	{
		
		
		
		
		RequestSpecification req = RestAssured.given();
		

		  Response res = req.delete("http://rmgtestingserver:8084/projects/TY_PROJ_16128");
		   int Statuscode=res.getStatusCode();
		   Assert.assertEquals(204, Statuscode);
		   System.out.println(res.asPrettyString());
		  
		  
	}

}
