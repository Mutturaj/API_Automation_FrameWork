package com.zepto.automation.services.UserserachSeravices.Validators;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import comon.zeptonow.controller.common.pojo.userSearch.Example;
import io.restassured.response.Response;
import org.testng.Assert;

public class SearchServicesValidator {

  static ObjectMapper objectMapper = new ObjectMapper();

  public static void validateSearchResponse(Response response) {
    Assert.assertEquals(response.getStatusCode(), 200, "Status Code is incorrect!");
    Assert.assertTrue(response.getBody().asString().contains("results"), "Response doesn't contain results!");

  }

  public static void validateWidget(Response response, String widgetName) throws JsonProcessingException {
    Example example = objectMapper.readValue(response.getBody().asString(), Example.class);
    Assert.assertEquals(response.getStatusCode(), 200);
    Assert.assertEquals(example.getLayout().get(1).widgetId, widgetName, "Widget ID does not match!");

  }
}