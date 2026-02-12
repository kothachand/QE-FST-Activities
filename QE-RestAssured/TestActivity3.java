package Demos;
import org.testng.annotations.Test;
import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

public class TestActivity3 {
    String baseurl="https://petstore.swagger.io/v2/user";
    @Test
    public void addnewuser(){
        //String Reqbody="""
               // {
                // "id":345679,
                // "username":"Gopi_123",
                // "firstname":"gopi chand",
                // "lastname":"kotha",
                // "email":"gopi@gmail.com",
                // "password":"Gopi@123",
                 //"phone":8790657890
                // }
               // """;
    File in  =new File("C:\\Users\\KothaGopiChand\\Desktop\\QE-RestAssured\\restassured\\src\\test\\Resources\\Activity.json");
    HashMap<String, Object> userData=new HashMap<>();
    userData.put("id", 3456799);
    userData.put("username", "Gopi_123");
    userData.put("firstname", "gopi chand");
    userData.put("lastname", "kotha");
    userData.put("email", "gopi@gmail.com");
    userData.put("password", "Gopi@123");
    userData.put("phone", 879065789);

        Response response = given().contentType(ContentType.JSON).body(in).when().post(baseurl);
        System.out.println(response.asPrettyString());
    }
    @Test
    public void getuser(){
        Response res = given().contentType(ContentType.JSON).pathParam("username", "Gopi_123").when().get(baseurl+"/{username}");
        System.out.println(res.asPrettyString());
    }
    @Test
    public void deluser(){
        Response res1= given().contentType(ContentType.JSON).pathParam("email","gopi@gmail.com").when().delete(baseurl+"/{email}");
        System.out.println(res1.asPrettyString());
    }
}
