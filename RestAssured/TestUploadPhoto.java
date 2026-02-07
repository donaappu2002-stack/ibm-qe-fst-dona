package RestAssured;

//import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestUploadPhoto {
    String ROOT_URI = "https://petstore.swagger.io/v2/pet";
    String UploadimageURI = ROOT_URI + "/{petId}/uploadImage";

    	
@Test
public void addPetImage() {
    // Get file to upload
    File petImage = new File("src/test/resources/1000158322.jpg");
    Response response = given().multiPart(petImage) // Add image to upload
        .pathParam("petId", "3634") // Set petId parameter
        .when().post(UploadimageURI); // Send POST request
 
    // Print response
    System.out.println(response.asPrettyString());
 
    // Assertion
    response.then().body("code", equalTo(200));
}

    
}
