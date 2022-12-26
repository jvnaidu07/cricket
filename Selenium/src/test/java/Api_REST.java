import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.net.CacheRequest;
import java.sql.SQLOutput;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class Api_REST {
    @Test
    void get (){
        given().contentType(JSON).get("https://reqres.in/api/users?page=2").then()
                .statusCode(200).log().all();
    }
    @Test
    void post() {
        String venky ="kalyaan";
        given().contentType(JSON).body(venky.toString()).post("https://reqres.in/api/users")
                .then().
                statusCode(201).log().all();
    }
    @Test
    void put(){
        JSONObject json=new JSONObject();
        json.put("name" ," kalyan");
        json.put("job","tester");
        System.out.println(json);
        given().body(json).put("https://reqres.in/api/users/2")
                .then().assertThat().statusCode(200).log().all();
    }
    @Test
    void post1(){
        String kal="{\n" +
                "    \"email\": \"eve.holt@reqres.in\",\n" +
                "    \"password\": \"pistol\"\n" +
                "}";
        Response response=given().body(kal).contentType(ContentType.JSON).
                post("https://reqres.in/api/register").then().assertThat().statusCode(200)
                .extract().response();
        System.out.println(response.asString());
    }
    @Test
    void patch(){
        String VENKAT="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        Response response=given().body(VENKAT).contentType(JSON).patch("https://reqres.in/api/users/2")
                .then().assertThat().statusCode(200).extract().response();
    }
    }