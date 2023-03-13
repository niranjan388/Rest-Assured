package Authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicPrimitiveautho
{
	@Test
	public void basicprimitiveautho()
	{
		RestAssured.baseURI="http://rmgtestingserver:8084/";
		RestAssured.given().auth().preemptive().basic("rmgyantra", "rmgy@9999").when().get("/login").then().assertThat().statusCode(202);
	}
	
	


}
