package DifferentWaystopost;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UsingJsonFile
{
	@Test
	public void JsonFile()
	{
		
		RestAssured.baseURI="http://rmgtestingserver:8084/";
		File file = new File("./CreateProject.json");
		
		RestAssured.given().body(file).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}

}
