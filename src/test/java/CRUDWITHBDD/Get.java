package CRUDWITHBDD;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Get
{
  @org.testng.annotations.Test
  public void getallproject() 
  {
	  
	 
		
		RestAssured.baseURI = "http://rmgtestingserver:8084";
	
	 RestAssured.when().get("/projects/")
	 .then().statusCode(200).contentType(ContentType.JSON).assertThat().log().all();
	  
  }

}
