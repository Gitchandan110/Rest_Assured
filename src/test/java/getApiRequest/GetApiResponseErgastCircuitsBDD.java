package getApiRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetApiResponseErgastCircuitsBDD {
	
/*API URL is "http://ergast.com/mrd/"
We are using Behavior Driven Framework here	
1) given 2) when 3) then 4) assert
To use BDD Framework we have Imported 2 Static Plugin mentioned above 
*/

	@Test
	
	public void testErgastCircuits() {
		
	given().
	when().
	get("http://ergast.com/api/f1/2019/circuits.json").
	then().
	assertThat().
	statusCode(200).
	and().
	body("MRData.CircuitTable.Circuits.circuitId" , hasSize(21));
		
		
		
		
		
	}
	
	

}
