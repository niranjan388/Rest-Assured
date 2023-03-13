package Pojoscript;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenaricUtil.Baseclass;
import GenaricUtil.ExcelUtil;
import GenaricUtil.JavaUtil;

import POJO.CreateProject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DataDrivernTesting extends Baseclass
{
	JavaUtil javautil=new JavaUtil();
	@Test(dataProvider = "ReadthedatafromDataprovider")
	public void createproject(String createdBy, String projectName, String status, String Teamsize)
	{
		int ran = javautil.GetRandomNumber();
		int size = javautil.Convertstringtoint(Teamsize);
		CreateProject createproject = new CreateProject(createdBy, projectName+ran,status, size);
		Response response = request.postrequest(createproject, 2000);
		String ExptedprojectName = createproject.getProjectName();
		String actualprojectName = response.jsonPath().get("projectName");
		Assert.assertEquals(ExptedprojectName, actualprojectName);
		System.out.println("Created Sucessfully and project Name is "+actualprojectName);

	}
	
	
	@DataProvider
	public String[][] ReadthedatafromDataprovider() throws EncryptedDocumentException, IOException
	{
		ExcelUtil excel=new ExcelUtil();
		String[][] array = excel.getdatafordataprovider();
		return array;
	}

}
