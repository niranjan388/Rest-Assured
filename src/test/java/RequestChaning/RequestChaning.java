package RequestChaning;

import org.testng.annotations.Test;

import GenaricUtil.Baseclass;
import GenaricUtil.EndPoint;
import GenaricUtil.JavaUtil;
import POJO.CreateProject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class RequestChaning extends Baseclass
{


	@Test
	public void requestchain()
	{
		JavaUtil rdm=new JavaUtil();
		int ran = rdm.GetRandomNumber();
		CreateProject createproject = new CreateProject("Niranjan", "Nj1SSSSS"+ran, "strted", 20);
		Response response = request.postrequest(createproject, 2000);
		
		String projectid =  restassured.getjasondata(response, "projectId");
		System.out.println("Project id is "+projectid);
		request.GetProject(projectid);
	}

}
