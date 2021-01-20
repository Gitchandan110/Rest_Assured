package getApiRequest;

import io.restassured.RestAssured.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import java.util.Collection;

import org.hamcrest.Matchers.*;
import org.hamcrest.object.HasEqualValues;
import org.testng.annotations.Test;

import groovy.transform.EqualsAndHashCode;

public class GetFormula1RacingYear2017Round1 {
	
	@Test
	public void testFormula1RacingYear2017Round1() {
		
		given().
	
	    when().
	    
	    get("http://ergast.com/api/f1/2017/1.json").
	
	    then().
	    
	    assertThat().
	    
	    statusCode(200).
	    
	    and().
	    
	    body("MRData.RaceTable.Races.Circuit.circuitId", hasSize(1)).
	    
	    and().
	    
	   header("Connection", "close").
	    
	    and().
	    
	    header("Content-Length", "621").
		
		and().
		
		header("Content-Type", "application/json; charset=utf-8");
		
	}

}
