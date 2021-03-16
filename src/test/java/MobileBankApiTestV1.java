import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {


        given()
                .baseUri("https://postman-echo.com")
                .body("Hello World")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", Matchers.equalTo("Hello World"));
    }
}