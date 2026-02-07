package RestAssured;

//import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestUpdatePet {
     String ROOT_URI = "https://petstore.swagger.io/v2/pet";
@Test
public void AddNewPet() {
    // Write the request body
    String reqBody = """
    {
        "id": 3634, 
        "name": "Donu", 
        "status": "chuchu"
    }""";

    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .body(reqBody).when().put(ROOT_URI);

        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);


}
}
