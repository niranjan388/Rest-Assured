package CURDWITHOUTBDD;


import java.net.URI;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetAllProjects
{
	@org.testng.annotations.Test
	public void PostTheRequest()
	{
		
	
		
		
		RequestSpecification req = RestAssured.given();
	
		

		 Response res = req.get("http://rmgtestingserver:8084/projects");
		   int Statuscode=res.getStatusCode();
		   long time = res.getTime();
		   System.out.println(time);
		   System.out.println(res.getContentType());
		   Assert.assertEquals(200, Statuscode);
		   System.out.println(res.prettyPeek());
		 		  
	}

}
