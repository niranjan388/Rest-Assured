package GenaricUtil;
/**
 * This class consist of all the basic activity for the script
 * @author Admin
 *
 */

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Baseclass 
{
	protected Databaseutil database=new Databaseutil();
	
	protected RequestClass request=new RequestClass();
	protected RestAPIUtil restassured=new RestAPIUtil();
	
	@BeforeSuite
	public void ConnettoDatabase() throws SQLException
	{
	
		database.connectdatabase();
	}
	
	
	@AfterSuite
	public void Disconnetdatabase() throws SQLException
	
	{
		database.closedatabase();
	}

}
