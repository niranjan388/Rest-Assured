package GenaricUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;

import com.mysql.cj.jdbc.Driver;

public class Databaseutil 
{
	Statement statment;
	Connection conn;
	public void connectdatabase() throws SQLException
	{
		Driver dbdriver = new Driver();
		DriverManager.registerDriver(dbdriver);
		conn = DriverManager.getConnection(Iconstant.DBURL,Iconstant.DBUSERNAME,Iconstant.DBPASSWORD);

		statment = conn.createStatement();



	}

	public void ExecuteQuery(String Query,String Expdata,int index) throws SQLException
	{
		boolean flag=false;
		ResultSet result = statment.executeQuery(Query);

		while(result.next())
		{
			String actualprojectID = result.getString(index);

			if(actualprojectID.equals(Expdata))
			{
				flag=true;
				break;
			}
		}

		Assert.assertEquals(flag, true);
		System.out.println("Testcase is pass and project Id is:"+Expdata);
	}



	public void closedatabase() throws SQLException

	{
		statment.close();
		conn.close();
	}

}

