package RestAssured;

import java.io.File;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestInput {
    String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
public void addNewPet() throws IOException {
    // Import JSON file
    File file = new File("src/test/resources/input.json");
 
    System.out.println(file);
 
    Response response = given()
        .contentType(ContentType.JSON) // Set headers
        .body(file) // Pass request body from file
        .when().post(ROOT_URI); // Send POST request
 
    // Print response
    String body = response.getBody().asPrettyString();
    System.out.println(body);
 
    //inputJSON.close();
 
    // Assertion
    response.then().body("id", equalTo(3634));
    response.then().body("name", equalTo("Xor"));
}
}
