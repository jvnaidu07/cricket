import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import javax.xml.ws.Response;

import static io.restassured.RestAssured.given;

public class Api_new {

    @Test
    void get(){
       given().contentType(ContentType.JSON).
       get("https://reqres.in/api/users?page=2").then().statusCode(200)
               .log().all();
    }
    @Test
    void post(){
        String venkat="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given().contentType(ContentType.JSON).
                body(venkat.toString()).post("https://reqres.in/api/users")
                .then().statusCode(201).log().all();

    }
    @Test
    void patch(){
        String venkat="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        given().contentType(ContentType.JSON).body(venkat.toString()).post("https://reqres.in/api/users/2")
                .then().statusCode(201).log().all();
    }
    @Test
    void put(){
        String venkat="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        given().contentType(ContentType.JSON).body(venkat.toString()).put("https://reqres.in/api/users/2")
                .then().statusCode(200).log().all();
    }
}
