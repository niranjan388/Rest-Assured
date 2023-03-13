package Authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

public class Basicautho
{
	@Test
	
	public void basicautho()
	{
		RestAssured.baseURI="http://rmgtestingserver:8084/";
		 RestAssured.given().auth().basic("rmgyantra", "rmgy@9999").when().get("/login").then().assertThat().statusCode(202).log().all();
	
	
	}
	
	@Test
	public void digestautho()
	{
		RestAssured.baseURI="http://rmgtestingserver:8084";
		RestAssured.given().auth().digest("rmgyantra", "rmgy@9999").when().get("/login").then().assertThat().statusCode(202).log().all();
	
	
	
	}

}
