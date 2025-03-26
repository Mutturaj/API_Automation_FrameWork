package comon.zeptonow.controller;

import comon.zeptonow.controller.utility.ConfigReader;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class UserController {

  private static final String BASE_URL = ConfigReader.configData.get("base_url").asText();

  public Response getUserDetails(String userId) {
    return given()
        .baseUri(BASE_URL)
        .header("Content-Type", "application/json")
        .when()
        .get(ConfigReader.configData.get("user.getUser").asText().replace("{userId}", userId))
        .then()
        .extract()
        .response();
  }
}