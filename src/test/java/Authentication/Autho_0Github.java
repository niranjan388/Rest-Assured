package Authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Autho_0Github 
{
	
	@Test
	public void autho2_0git()
	{
		  Response res = RestAssured.given().auth().basic("niranjan388", "gITHUB123$")
		  .formParam("Client ID","0d831666caa5362d211b")
		  .formParam("Client secrets","229b00ed161412b5caa16e67c784a66a2af9ed62")
		  .formParam("redirect_uri","https://github.com")
		  .formParam("code","https://github.com/login/oauth/authorize")
		  .formParam("login","niranjan388")
		  .formParam("scope","repo")
		  .formParam("state","Karnataka") 
		  .formParam("allow_signup",true)
		 
		     .header("Accept", "application/json")
		  
		  .contentType(ContentType.JSON).when().post("https://github.com/login/oauth/access_token");
		  res.then().assertThat().statusCode(400).log().all();
		// String token = res.jsonPath().get("access_token");
		 
		 //System.out.println(token);
			/*
			 * Response ress = RestAssured.given()
			 * .formParam("Client ID","0d831666caa5362d211b")
			 * .formParam("Client secrets","229b00ed161412b5caa16e67c784a66a2af9ed62")
			 * .formParam("redirect_uri","https://github.com")
			 * 
			 * .formParam("code","https://github.com/login/oauth/authorize")
			 * 
			 * .contentType(ContentType.JSON).when().post(
			 * "https://github.com/login/oauth/access_token");
			 * 
			 * ress.then().assertThat().log().all();
			 */
	
	
	
	
	
	//String token = res.jsonPath().get("access_token");
	
	

	
//	RestAssured.given().auth().oauth2(token).when().post("http://coop.apps.symfonycasts.com/api/4200/eggs-count").then().assertThat().statusCode(200).log().all();
	}
}
