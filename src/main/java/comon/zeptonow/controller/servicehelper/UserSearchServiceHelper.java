package comon.zeptonow.controller.servicehelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import comon.zeptonow.controller.utility.ConfigReader;
import comon.zeptonow.controller.utility.HeaderManager;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class UserSearchServiceHelper {

  private static final String BASE_URL = ConfigReader.configData.get("qa").get("user").get("UserSearch_BaseURL").asText();
  private static final String SEARCH_USER_ENDPOINT = ConfigReader.configData.get("qa").get("user").get("search").asText();

  public Response SearchQueryRequest(String query,String tenant) throws JsonProcessingException {
    return given().baseUri(BASE_URL).headers(HeaderManager.getHeadersForSearch(tenant)).body(RequsetBodyHelper.getReuesetbodyForSearch(query)).
        when().post(SEARCH_USER_ENDPOINT).
        then().extract().response();

  }

  public Response searchUser(String query) {
    return given()
        .baseUri(BASE_URL)
        .header("Content-Type", "application/json")
        .queryParam("search", query)
        .when()
        .get(SEARCH_USER_ENDPOINT)
        .then()
        .extract()
        .response();
  }


}