package com.test.api;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class HealthCheckTest {
        @Test
    public void healthCheckTest(){
                    given().
                    when().
                    get("https://restful-booker.herokuapp.com/ping").
                    then().
                    assertThat().
                    statusCode(201);
    }

    @Test
    public void healthCheckTest2(){
        given().
                when().
                get("https://restful-booker.herokuapp.com/ping").
                then().
                assertThat().
                statusCode(201);
    }

    @Test
    public void healthCheckTest3(){
        given().
                when().
                get("https://restful-booker.herokuapp.com/ping").
                then().
                assertThat().
                statusCode(201);
    }
    @Test
    public void healthCheckTest4(){
        given().
                when().
                get("https://restful-booker.herokuapp.com/ping").
                then().
                assertThat().
                statusCode(201);
    }
}
