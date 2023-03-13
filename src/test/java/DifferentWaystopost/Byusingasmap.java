package DifferentWaystopost;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Byusingasmap
{
	
	@Test
	public void HasMap()
	
	{
		
		RestAssured.baseURI="http://rmgtestingserver:8084/";
		HashMap values = new HashMap();
		
		values.put("createdBy", "Niranjan");
		values.put("projectName","Nj22");
		values.put("status","Started");
		values.put("teamSize",12);
		
		given().body(values).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
		
		
	}

}
