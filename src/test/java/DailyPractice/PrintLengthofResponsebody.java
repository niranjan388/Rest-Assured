package DailyPractice;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PrintLengthofResponsebody 
{

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://gorest.co.in";
		 
		JSONObject js=new JSONObject();
		js.put("name","NiranjanSapna");
		js.put("gender","male");
		js.put("email","NiranjanSaikjt@Gmail.com");
		js.put("status","active");
		
		Response res = RestAssured.given().auth().oauth2("cd004eaa1d30a2ba4719197c1d06909d520deddfe081c935a5345a18f9d847be").body(js).contentType(ContentType.JSON)
		
		.when().post("/public/v2/users");
		
		
	res.then().assertThat().statusCode(201).time(Matchers.lessThan(4000L), TimeUnit.MILLISECONDS).log().all();
	
	String userid = res.jsonPath().get("id").toString();
	String email = res.jsonPath().get("name");
	
	
	System.out.println(userid.length());
	System.out.println(email.length());
	}

}
