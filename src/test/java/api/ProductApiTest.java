package api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ProductApiTest {

    private final String BASE_URL = "https://fakestoreapi.com";

    @Test
    public void getAllProductsTest() {
        Response response =
                given()
                        .baseUri(BASE_URL)
                .when()
                        .get("/products")
                .then()
                        .extract()
                        .response();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getList("$").size() > 0);
    }

    @Test
    public void getSingleProductTest() {
        Response response =
                given()
                        .baseUri(BASE_URL)
                .when()
                        .get("/products/1")
                .then()
                        .extract()
                        .response();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("id"), 1);
        Assert.assertNotNull(response.jsonPath().getString("title"));
        Assert.assertTrue(response.jsonPath().getDouble("price") > 0);
    }

    @Test
    public void invalidProductIdTest() {
        Response response =
                given()
                        .baseUri(BASE_URL)
                .when()
                        .get("/products/999999")
                .then()
                        .extract()
                        .response();

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.asString().equals("null") || response.asString().isEmpty());
    }
}