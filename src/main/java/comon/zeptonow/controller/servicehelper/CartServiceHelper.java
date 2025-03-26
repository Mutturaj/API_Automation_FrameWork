package comon.zeptonow.controller.servicehelper;

import static io.restassured.RestAssured.given;
import com.fasterxml.jackson.core.JsonProcessingException;
import comon.zeptonow.controller.utility.ConfigReader;
import comon.zeptonow.controller.utility.HeaderManager;
import io.restassured.response.Response;


public class CartServiceHelper {

  private static final String BASE_URL = ConfigReader.configData.get("qa").get("product").get("baseURL_Cart").asText();
  private static final String CART_ENDPOINT=ConfigReader.configData.get("qa").get("product").get("Cart_Endpoint").asText();

  public Response addToCart() throws JsonProcessingException {
    return given()
        .baseUri(BASE_URL)
        .headers(HeaderManager.getHeadersForCart())
        .body(RequsetBodyHelper.getCartRequestBody()).contentType("application/json")
        .when()
        .post(CART_ENDPOINT)
        .then()
        .extract()
        .response();
  }
}
