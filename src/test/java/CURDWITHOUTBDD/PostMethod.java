package CURDWITHOUTBDD;

import org.json.simple.JSONObject;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostMethod
{
	@org.testng.annotations.Test
	public void PostTheRequest()
	{
		
		
		JSONObject jobj = new JSONObject();
		
		jobj.put("createdBy", "Niranjan");
		jobj.put("projectName","Nj2222");
		jobj.put("status","Started");
		jobj.put("teamSize",12);
		
		//RestAssured.baseURI="http://rmgtestingserver:8084";
		
		RequestSpecification req = RestAssured.given();
		
		RestAssured.baseURI="http://rmgtestingserver:8084/";
		
		 req.body(jobj);
		 req.contentType(ContentType.JSON);
		 Response one = req.request(Method.POST,"addProject");
		// Response res = req.request(Method.POST,"addProject");
		   
		
		   int Statuscode=one.getStatusCode();
		   Assert.assertEquals(201, Statuscode);
		   System.out.println(one.prettyPrint());
		   
		   
		  
	}

}
