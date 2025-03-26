package com.zepto.automation.services.UserserachSeravices.Validators;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import org.testng.Assert;

public class CartValidator {
  static ObjectMapper objectMapper = new ObjectMapper();

  public static void CartSatusCode(Response response) {
    if (response.getStatusCode() == 200) {
      Assert.assertEquals(response.getStatusCode(), 200, "Getting correct Status code");

    } else {
      Assert.assertEquals(response.getStatusCode(), 404, "No cart found");
    }
  }
}
