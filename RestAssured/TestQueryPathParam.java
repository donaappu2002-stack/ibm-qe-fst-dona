package RestAssured;

//import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestQueryPathParam {

    // Set Base URL with path parameter
    String ROOT_URI = "http://ip-api.com/json/";

@Test
public void getIPInformation() {
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .when()
        .queryParam("fields", "query,country,city,timezone") // Set path parameter
        .get(ROOT_URI+"/125.219.5.94");

        System.out.println(response.getBody().asPrettyString());


}}
