package GenaricUtil;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class RequestClass
{
	/**
	 * This Method is used to create a project
	 * @param createproject
	 * @param time
	 * @return
	 */
	public Response postrequest(Object createproject,long time)
	{
		RestAssured.baseURI=EndPoint.BASEURI;
		  Response res = RestAssured.given().body(createproject).contentType(ContentType.JSON)
		.when().post(EndPoint.CREATEPROJECT);
		  res.then().assertThat().log().all()
		.time(Matchers.lessThan(time),TimeUnit.MILLISECONDS)
		.statusCode(201).contentType(ContentType.JSON);
		
		return res;
	}
	
	
	public void GetProject(String path)
	{
		
		RestAssured.baseURI=EndPoint.BASEURI;
		RestAssured.when().get("/projects/"+path).
		then().assertThat().statusCode(200).log().all();
	
	}

}
