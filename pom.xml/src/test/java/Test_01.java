import com.sun.xml.internal.ws.client.AsyncResponseImpl;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import javax.xml.ws.Response;

import static io.restassured.RestAssured.given;

public class Test_01 {


    @Test
    void Test_01() {
        RestAssured.get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
        System.out.println("getStatuscode");
    }

    @Test
    void post() {
        String venkat= "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given().contentType(ContentType.JSON).body(venkat.toString()).post("https://reqres.in/api/users/2")
                .then().statusCode(201).log().all();

        }
     @Test
    void patch(){
        String venkat="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        given().contentType(ContentType.JSON).body(venkat.toString()).patch("https://reqres.in/api/users/2")
                .then().statusCode(200).log().all();
     }

    }
