package CRUDWITHBDD;

import org.json.simple.JSONObject;
import org.junit.Test;

import GenaricUtil.JavaUtil;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Updatedtheproject
{
  @org.testng.annotations.Test
  public void Posttherequest() 
  {
	  JavaUtil  rann=new JavaUtil();
	  int randomnum = rann.GetRandomNumber();
	  JSONObject jobj=new JSONObject();
	  jobj.put("createdBy", "Niranjan");
		jobj.put("projectName","Nj2222"+randomnum);
		jobj.put("status","Started");
		jobj.put("teamSize",12);
		
		RestAssured.baseURI = "http://rmgtestingserver:8084";
		
	
	 RestAssured.given().body(jobj).contentType(ContentType.JSON)
	 .when().put("/projects/TY_PROJ_16351")
	 .then().statusCode(200).contentType(ContentType.JSON).log().all();
	  
  }

}
