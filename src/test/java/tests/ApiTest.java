package tests;

import com.jayway.restassured.response.Response;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class ApiTest {

    private static Response response;
    private static String jsonAsString;

    @Test
    public void messageValidationApi(){

        response = given().when().get("https://jsonplaceholder.typicode.com/todos/1").then()
                .body("completed", equalTo(false))
                .body("id", equalTo(1))
                .body("title", equalTo("delectus aut autem"))
                .body("userId", equalTo(1))
                .statusCode(200)
                .extract().response();
        jsonAsString = response.asString();
        System.out.println(jsonAsString);
    }
}
