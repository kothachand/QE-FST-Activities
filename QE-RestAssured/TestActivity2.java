package Demos;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TestActivity2 {
     String baseURL="https://petstore.swagger.io/v2/";
     @Test
     public void addnewpet(){
         String reqBody = """
           {

              "id": 23567899,
            "name": "sherphed",
            "status": "available"
           }        
                   """;
        Response response = given().contentType(ContentType.JSON).body(reqBody).when().post(baseURL+"/pet/34598701");
        System.out.println(response.asPrettyString());
        }

        @Test
    public void getReq() {
        Response res = given().contentType(ContentType.JSON)
                .when().get(baseURL + "/pet/34598701");
        System.out.println(res.asPrettyString());

    }

    @Test
    public void deleteReq() {
        Response ress = given().contentType(ContentType.JSON).when().delete(baseURL + "/pet/34598701");
        System.out.println(ress.asPrettyString());
     }
    }

