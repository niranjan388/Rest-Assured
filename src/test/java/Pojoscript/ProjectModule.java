package Pojoscript;

import java.sql.SQLException;
import org.testng.annotations.Test;
import GenaricUtil.Baseclass;
import GenaricUtil.EndPoint;
import GenaricUtil.JavaUtil;
import GenaricUtil.RestAPIUtil;
import POJO.CreateProject;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ProjectModule extends Baseclass
{

	@Test
	public void createproject() throws SQLException
	{
		 JavaUtil random=new JavaUtil();
		int ran = random.GetRandomNumber();
		
		RestAssured.baseURI=EndPoint.BASEURI;
		CreateProject createproject = new CreateProject("Niranjan", "Nj1234"+ran, "started", 20);
		 Response response = request.postrequest(createproject,2000);
		
		String actualValue = restassured.getjasondata(response, "projectId");
		String Query = "select * from project";
		database.ExecuteQuery(Query, actualValue, 1);

	}
	




}
