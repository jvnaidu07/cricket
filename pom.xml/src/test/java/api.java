import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class api {
    @Test
    void get(){
        given().contentType(ContentType.JSON).
                get("https://reqres.in/api/users?page=2").
                then().statusCode(200).
                log().all();

    }
    @Test
    void post(){
        String kal="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given().contentType(ContentType.XML)
                .body(kal.toString()).post("https://reqres.in/api/users").
                then().statusCode(201).log().all();
    }
    @Test
    void put(){
        String venkat="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        given().contentType(ContentType.JSON)
                .body(venkat.toString()).put("https://reqres.in/api/users/2").
                then().statusCode(200).log().all();
    }
    @Test
    void patch(){
        JSONObject kal=new JSONObject();
        kal.put("name","kalyan");
        kal.put("job","tester");
        System.out.println(kal);
        RestAssured.baseURI="https://reqres.in/api/users/2";
        String venkat="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        given().contentType(ContentType.JSON).body(venkat.toString()).
                patch().then().statusCode(200).log().all();
    }
    @Test
    void delete(){
        given().contentType(ContentType.JSON)
                .delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
    }
}
