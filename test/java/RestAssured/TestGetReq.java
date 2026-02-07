package RestAssured;
//import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TestGetReq {
    // Set Base URL
String ROOT_URI = "https://petstore.swagger.io/v2/pet/";

@Test(dataProvider = "petIds")
public void GetPetDetails(String petId) {

// Send GET Request
    Response response=given().contentType(ContentType.JSON) // Set headers
    .when().get(ROOT_URI + petId); // Get pet details with GET

    System.out.println(response.getBody().prettyPrint());
    System.out.println("Status code: " + response.getStatusCode());
}

@DataProvider
public Object[][] petIds() {
     Object[][] testData = new Object[][] { { "3634" }, { "8589" } };
        return testData;
}
}
