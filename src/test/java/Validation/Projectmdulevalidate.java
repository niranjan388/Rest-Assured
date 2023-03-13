package Validation;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenaricUtil.JavaUtil;

import POJO.CreateProject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Projectmdulevalidate 
{
	
	
	
		@Test
		public void post()
		{
			JavaUtil rdm=new JavaUtil();
			int ran = rdm.GetRandomNumber();
			
			RestAssured.baseURI="http://rmgtestingserver:8084/";
			CreateProject createproject = new CreateProject("Niranjan", "Nj1234"+ran, "strted", 20);
			
			RestAssured.given().body(createproject).contentType(ContentType.JSON)
			.when().post("/addProject")
					.then().assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS).statusCode(201).contentType(ContentType.JSON).log().all();
		
			
			
		}

	}



