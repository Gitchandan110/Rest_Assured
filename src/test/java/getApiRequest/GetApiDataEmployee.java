package getApiRequest;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetApiDataEmployee {
	
	
	@Test(priority=1)
	
	public void getResponseCode() {
		
		
		Response responce=RestAssured.get("http://dummy.restapiexample.com/api/v1/employee/1");
		System.out.println("Responce Time is: "+ responce.getTimeIn(TimeUnit.SECONDS) );
		
		int statuscode=responce.getStatusCode();
		
		System.out.println("Status Code is: " + statuscode );
		
		System.out.println("responce.asString() is : " +responce.asString());
		
		System.out.println("responce.getStatusLine() is : " +responce.getStatusLine());
		
		System.out.println("responce.getHeader_content-type is : " + responce.getHeader("content-type"));
		
		System.out.println("responce.getTime() is : " + responce.getTime());
		
		Assert.assertEquals(statuscode, 200);
		
	}
	
	@Test (priority=2)
	public void getResponseBody() {
		
		
		Response responce=RestAssured.get("http://dummy.restapiexample.com/api/v1/employee/1");
		System.out.println("Responce Time is: "+ responce.getTimeIn(TimeUnit.SECONDS) );
		String responseBody=responce.asString();
		
		System.out.println("Response body is: "+ responseBody );
		
	//
		
	}

}
