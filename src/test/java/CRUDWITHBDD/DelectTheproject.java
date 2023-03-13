package CRUDWITHBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DelectTheproject
{
	
	@Test
	
	public void deletproject()
	{
		RestAssured.baseURI = "http://rmgtestingserver:8084";
		RestAssured.when().delete("/projects/TY_PROJ_16351").then().statusCode(204).log().all();
	}

}
