package Parametrs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class PathParameters 
{
	
	@Test
	public void Path()
	{
		RestAssured.baseURI = "http://rmgtestingserver:8084";
		
		 RestAssured.given()
		.pathParam("projectid","TY_PROJ_11294")
		
		.when().get("/projects/{projectid}")
		 .then().statusCode(200).contentType(ContentType.JSON).assertThat().log().all();
	}

	@DataProvider
	public void CreateProjectMultipledata()
	{
		
	}
}
