package GoRest;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GORESTPOJO.Createuserpojo;
import GenaricUtil.JavaUtil;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class GorestApi
{
	JavaUtil javautil=new JavaUtil();
	int userid;
	@Test
	public void createuser()
	{ 
		
		
		baseURI="https://gorest.co.in";
		Createuserpojo createuser=new Createuserpojo("Niranjan"+javautil.GetRandomNumber(),"male","nj"+javautil.GetRandomNumber()+"@gmail.com","active");
	Response res = given().auth().oauth2("cd004eaa1d30a2ba4719197c1d06909d520deddfe081c935a5345a18f9d847be").body(createuser).contentType(ContentType.JSON)
	.when().post("/public/v2/users");
	   res.then().assertThat().statusCode(201).time(Matchers.lessThan(3000L), TimeUnit.MILLISECONDS).log().all();
	   
	
	 userid = res.jsonPath().get("id");
	System.out.println(userid);
	
	}
	
@Test(dependsOnMethods = "createuser")
public void getuser()
{
	baseURI="https://gorest.co.in";
	System.out.println(userid);
	 given().auth().oauth2("cd004eaa1d30a2ba4719197c1d06909d520deddfe081c935a5345a18f9d847be").
	
	when().get("/public/v2/users/"+userid+"").then().assertThat().log().all().statusCode(200);
	
	
}

}
