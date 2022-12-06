import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostTest {
    @Test
    void postBin() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("number, balance, id")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("number, balance, id"))
        ;
    }
}
