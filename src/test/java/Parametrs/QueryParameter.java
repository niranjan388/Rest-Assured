package Parametrs;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class QueryParameter
{
	
	@Test
	
	public void queryParam()
	{

		RestAssured.baseURI = "http://rmgtestingserver:8084";
		
		 RestAssured.given()
		.queryParam("page",2)
		
		.when().get("/projects/?{page}")
		 .then().statusCode(200).contentType(ContentType.JSON).assertThat().log().all();
	}

}

