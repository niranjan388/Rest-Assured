package CURDWITHOUTBDD;

import org.json.simple.JSONObject;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class updatedproject
{
	@org.testng.annotations.Test
	public void PostTheRequest()
	{
		
		
		JSONObject jobj = new JSONObject();
		
		jobj.put("createdBy", "Niranjan");
		jobj.put("projectName","125567");
		jobj.put("status","completd");
		jobj.put("teamSize",12);
		
		//RestAssured.baseURI="http://rmgtestingserver:8084";
		
		RequestSpecification req = RestAssured.given();
		 req.body(jobj);
		 req.contentType(ContentType.JSON);
		  Response res = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_16128");
		   int Statuscode=res.getStatusCode();
		   Assert.assertEquals(200, Statuscode);
		   System.out.println(res.prettyPrint());
		   
		  
	}

}
