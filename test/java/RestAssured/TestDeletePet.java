package RestAssured;

//import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TestDeletePet {

    String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
public void AddNewPet() {
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .when().delete(ROOT_URI + "/8589"); // Send DELETE request
    
    // Assert DELETE operation
    /* However, this will only work the first time
    * the DELETE request is run, because
    * the pet with id 77232 has already been deleted.
    */
    response.then().body("code", equalTo(200));
    response.then().body("message", equalTo("8589"));
}


    
}
