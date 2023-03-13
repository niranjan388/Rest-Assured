package Authentication;


import org.testng.annotations.Test;
import POJO.GithubCreaterepo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BarerToken
{
	@Test
	public void barerToken()
	{
		RestAssured.baseURI="https://api.github.com";
		
		GithubCreaterepo createrepo=new GithubCreaterepo("Nj123", "Used to store Api Framework", "mainpage");
		
		RestAssured.given().auth().oauth2("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").body(createrepo).contentType(ContentType.JSON).when().post("/user/repos").then().assertThat().statusCode(201).log().all();
		
	}

}
