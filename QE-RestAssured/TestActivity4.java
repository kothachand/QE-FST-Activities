package Demos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;


public class TestActivity4 {
    String baseURL ="https://petstore.swagger.io/v2";
    private RequestSpecification requestSpec;
    private ResponseSpecification responseSpec;

    @BeforeClass
    public void setup() {
        requestSpec = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setBaseUri("https://petstore.swagger.io/v2/pet")
            .build();

        responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build(); }
     @Test
     public void addnewpet(){
         String reqBody = """
           {

              "id": 77232,
            "name": "Riley",
            "status": "alive"
           }        
                   """;
           String reqBody1="""
                   {
                      "id":77233
                      "name":"Hansel",
                      "status":"alive"
                   }
                   """;
        Response response = given().contentType(ContentType.JSON).body(reqBody).when().post(baseURL+"/pet/77232");
        System.out.println(response.asPrettyString());

        Response respo= given().contentType(ContentType.JSON).body(reqBody1).when().post(baseURL+"/pet/77233");
        System.out.println(respo.asPrettyString());
        }

        @Test
    public void deleteUser() {
        Response response = given().spec(requestSpec)
        .pathParam("id", "77233")
        .when().delete("/{id}");

        response = given().spec(requestSpec)
        .pathParam("id", "77233")
        .when().get("/{id}");

        response.then().statusCode(404);

    }

    }


