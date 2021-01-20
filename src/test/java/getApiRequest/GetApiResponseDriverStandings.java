package getApiRequest;

import io.restassured.RestAssured.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class GetApiResponseDriverStandings {
	
	@Test
	public void testDriverStanding() {
		
		given().
		when().
		get("http://ergast.com/api/f1/2008/5/driverStandings.json").
		then().
		assertThat().
		statusCode(200).
		and().
		body("MRData.StandingsTable.StandingsLists.DriverStandings.Driver.driverId" , hasSize(22));
			
		
		
	}
	
	
	

}
