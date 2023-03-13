package GenaricUtil;
/**
 * This Class consist of Restasrued generic Methods
 * @author Admin
 *
 */



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAPIUtil

{
	
	
	
public String  getjasondata(Response res, String path)

{
	return res.jsonPath().get(path);	
}
	





	

}
