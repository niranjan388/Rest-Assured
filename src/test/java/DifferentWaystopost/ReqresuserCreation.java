package DifferentWaystopost;


import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import POJO.ReqResCreateuser;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ReqresuserCreation
{
	@Test
	public static void createuser()
	{
		RestAssured.baseURI="https://reqres.in";
		ReqResCreateuser value = new ReqResCreateuser("Niranjan", "QA");
		
		
		RestAssured.given().body(value).contentType(ContentType.JSON)
		.when().post("/api/users").then().assertThat().statusCode(201)
		.time(Matchers.lessThan(3500L)).log().all();
		
	}

}
