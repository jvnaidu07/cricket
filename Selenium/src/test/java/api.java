
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class api {
    @Test
    void get(){
        given().get("https://reqres.in/api/users?page=2").
                then().statusCode(200).
                log().all();

    }
    @Test
    void get1(){
        given().get("https://reqres.in/api/users/2").then().statusCode(201)
                .log().all();
    }
    @Test
    void Post (){
        String venkatt = "" +
                "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given().contentType(ContentType.JSON).body(venkatt.toString())
                .post ("https://reqres.in/api/users").then().statusCode(201)
                .log().all();
    }
    }

