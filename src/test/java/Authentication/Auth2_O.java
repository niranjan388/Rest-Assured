package Authentication;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Auth2_O 
{
	@Test
	public void auth2_0()
	{
		Response res = RestAssured.given()
		.formParam("Client ID","0d831666caa5362d211b")
		.formParam("Client secrets","229b00ed161412b5caa16e67c784a66a2af9ed62")
		.formParam("redirect_uri","https://github.com")
		.formParam("login","http://Facebook.com")
		.formParam("scope","repo")
		.formParam("state","Karnataka")
		.formParam("allow_signup",true)
		.when().post("http://coop.apps.symfonycasts.com/token");
		res.then().assertThat().log().all();
		
		String token = res.jsonPath().get("access_token");
		
		
  
		
		RestAssured.given().auth().oauth2(token).when().post("http://coop.apps.symfonycasts.com/api/4200/eggs-count").then().assertThat().statusCode(200).log().all();
		RestAssured.given().auth().oauth2(token).when().post("http://coop.apps.symfonycasts.com/api/4200/eggs-collect").then().assertThat().statusCode(200).log().all();
		RestAssured.given().auth().oauth2(token).when().post("http://coop.apps.symfonycasts.com/api/4200/chickens-feed").then().assertThat().statusCode(200).log().all();
		RestAssured.given().auth().oauth2(token).when().post("http://coop.apps.symfonycasts.com/api/4200/barn-unlock").then().assertThat().statusCode(200).log().all();
		RestAssured.given().auth().oauth2(token).when().post("http://coop.apps.symfonycasts.com/api/4200/chickens-feed").then().assertThat().statusCode(200).log().all();
		
	}
	

}
