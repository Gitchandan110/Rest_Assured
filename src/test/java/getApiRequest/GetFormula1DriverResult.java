package getApiRequest;

import io.restassured.RestAssured.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import org.hamcrest.Matchers.*;
import org.hamcrest.object.HasEqualValues;
import org.testng.annotations.Test;

public class GetFormula1DriverResult {
	
	@Test
	public void testDriverResult() {
		
		given().
		
		when().
		
		get("http://ergast.com/api/f1/2008/drivers/alonso/results.json").
		
		then().
		
		assertThat().
		
		statusCode(200).
		
		and().
		
		body("MRData.RaceTable.Races.season.", hasSize(18));
		
		
		
		
		
		
		
	}
	

}
